package br.com.voeairlines.bo;

public interface IValidacaoEmbarque {
	

	
	//static - � da classe
	//no-static - � de inst�ncia (do objeto)
	//Cliente c= new Cliente();
	//c.cadastrar("romulo")
	
	//Cliente.cadastrar("romulo")
	//Classe ManipularArquivo( )
	//Manipulacao.ManipulaArquivo( )
	
	//Aplica��o -JDBC-Conex�o Statica   Banco de Dados
	
	public static final int IDADEMIN=18; //CONSTANTE..
	
	//Contrato com o SENAI
	//Contrato com a esposa/esposo
	//Contrato de aluguel
	//Contrato quando nasce
	//Contrato quando morre
	
	//Java 7
	public abstract String validaIdade(int idade); //Assinatura de Contrato
	
	//Apartir do Java 8 - 2014-6 anos

}
