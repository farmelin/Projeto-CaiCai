package br.com.caicai.modelo;

public class Elevador {

	private String nome;
	private int maximoPessoas;
	private int andarMaximo;
	private int andarMinimo;
	private int andarAtual;
	private int qtdePessoas;
	
	// Entradas:
	
	// <modificador> <tipo do retorno> <nome do metodo> (<Tipo Param> <nome param>)	
	
	public void inicializar (String pNome, int pMaxPessoas, int pAndarMax, int pAndarMin) {
		nome = pNome;
		maximoPessoas = pMaxPessoas;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
	}
		
	// Retornos:
	
		
	public String toString() {
		return "Elevador [nome=" + nome + ", maximoPessoas=" + maximoPessoas + ", andarMaximo=" + andarMaximo
				+ ", andarMinimo=" + andarMinimo + ", andarAtual=" + andarAtual + ", qtdePessoas=" + qtdePessoas + "]";
	}
	
	public void entrar () {
		if (qtdePessoas < maximoPessoas) {
			qtdePessoas = qtdePessoas + 1;			
		}
	}

	public void sair () {
		if (qtdePessoas > 0) {
			qtdePessoas =  qtdePessoas - 1;
		}
	}
		
	public String subir(int andar) {
		if ((andar + andarAtual) <= andarMaximo) {
			andarAtual = andarAtual + andar;
			return "Subindo";
		}
		return "Andar inválido";
	}

	public String descer(int andar) {
		if ((andarAtual - andar) >= andarMinimo) {
			andarAtual = andarAtual - andar;
			return "Descendo";
		}
		return "Andar inválido";
	}
	
	public String descer() {
		if (andarAtual > andarMinimo){
			andarAtual = andarAtual - 1;
			return "Descendo";
		}
		return "Andar inválido";
	}
	
}
