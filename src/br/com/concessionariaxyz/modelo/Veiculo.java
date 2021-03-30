package br.com.concessionariaxyz.modelo;

public class Veiculo {
	private String cor;
	private String montadora;
	private float valor;
	// Classes Wrappers: classe que apoia os tipos primitivos
	// Float -> float - Integer -> int - Double -> double - Boolean -> boolean
	// modificador - tipo do retorno - nome do metodod (tipo param- nome param)
	//boolean < char < byte < short < int < long < float < double
	public float retornarDesconto(float porcentagem) {
	return valor = valor * (porcentagem / 100);
	}
	
	public float retornarDesconto() {
		return valor * (float) 0.9;

	}

	
	

	public String toString() {
		return "Cor: " + cor + "\n" + "Montadora: " + montadora + "\n" + "Valor: " + valor;
	}

	public String retornarCor() {
		return cor;
	}

	public String retornarMontadora() {
		return montadora;
	}

	public void preencherMontadora(String param) {
		montadora = param.toUpperCase();
	}

	public float retornarValor() {
		return valor;
	}

	public void preencherValor(float param) {
		if (param > 0) {
			valor = param;
		}
	}

	public void preencherCor(String param) {
		if (param.length() > 2) {

			cor = param.toUpperCase();

		}

	}

}
