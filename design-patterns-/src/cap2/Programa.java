package cap2;

import java.util.Arrays;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		NotasMusicais notas = new NotasMusicais();
		List<Nota> musica = Arrays.asList(notas.pegaNota("do"), notas.pegaNota("re"), notas.pegaNota("mi"),
				notas.pegaNota("sol"), notas.pegaNota("sol"), notas.pegaNota("mi"), notas.pegaNota("fa"),
				notas.pegaNota("fa"), notas.pegaNota("do"), notas.pegaNota("re"), notas.pegaNota("mi"),
				notas.pegaNota("sol"), notas.pegaNota("sol"), notas.pegaNota("fa"), notas.pegaNota("mi"));
		Instrumento instrumento = new Piano();
		instrumento.toca(musica);
	}
}
