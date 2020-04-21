package br.com.alura.listavip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.alura.emviadoEmail.enviadorEmail.EmailService;
import br.com.alura.listavip.Model.Convidado;
import br.com.alura.listavip.repository.ConvidadoRepository;

@Controller
public class ConvidadoController {

	@Autowired
	private ConvidadoRepository repository;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/listaconvidados")
	public String listaConvidos(Model model) {

		Iterable<Convidado> convidados = repository.findAll();
		model.addAttribute("convidados", convidados);
		return "listaconvidados";
	}
	
	@RequestMapping(value="/salvar",method=RequestMethod.POST)
	public String salvar(Convidado convidado, Model model) {
		
		repository.save(convidado);
		
		new EmailService().enviar(convidado.getNome(),convidado.getEmail());
		Iterable<Convidado> convidados = repository.findAll();
		model.addAttribute("convidados", convidados);
		return "listaconvidados";
	}

}
