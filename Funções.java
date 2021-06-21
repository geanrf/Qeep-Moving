
public class Funções {

	public static void main(String[] args) {
		
		// String padrão
		String textoDeExemplo = "Vamos chamar uma funão.";
		int resultado = textoDeExemplo.funcao(parametros);
		
		// A função length() retorna o tamanho da String, ou a quantidade de caracteres contidos nela.
		String nomeDoGean = "Gean Rocha França";
		int tamanho = nomeDoGean.length();
		
		// chaAt(posição) retorna o caractere da String que está na posição passada como parâmetro.
		String nomeDoGean = "Gean Rocha França";
		int letra = nomeDoGean.charAt(2);
		
		// contains(texto), retorna um valor booleano, caso o conteúdo de texto exista dentro da String.
		String nomeDoGean = "Gean Rocha França";
		int existeDentro = nomeDoGean.contains("Rocha");
		
		// toUpperCas() retorna a String na qual ela é aplicada com todos os caracteres maiúsculos.
		String nomeDoGean = "Gean Rocha França";
		int nomeDoGeanMaisculo = nomeDoGean.toUpperCase();
		
		
		// toLowerCase () retorna a String na qual ela é aplicada com todos os caracteres minúsculos.
		String nomeDoGean = "Gean Rocha França";
		int nomeDoGeanMinusculo = nomeDoGean.toLowerCase();
		
		// replace() procura em uma String um texto/caractere, e o substitui pelo texto/caractere contido no segundo parâmetro.
		String seguenciasA = "aaaa";
		String seguenciaB = sequenciaA.replace('a','b');
		
		// indexOf(texto/char) retorna o índicce da primeira ocorrência do conteúdo que é passado como parâmetro.
		String nomeDoGean = "Gean Rocha França";
		int postLetraD = nomeDoGean.indexOf('G');
		
		// lastindexOf(texto/char) retorna o índicce da última ocorrência do conteúdo que é passado como parâmetro.
		String nomeDoGean = "Gean Rocha França";
		int ultimaPosLetraA = nomeDoGean.lastIndexOf('a');
		
		
		//

	}

}
