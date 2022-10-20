package br.com.geovanag.projetoseguinte;

public class classeConta {

	int atributoNumeroConta; //0
	//String atributoNomeConta; //Null // Null != ""
	double atributoSaldoConta; //0.0
	classePessoa atributoClienteConta;
	
	void metodoDepositar(double parametroValor) {
		
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValor + (parametroValor * .1);
		//this.atributoSaldoConta += parametroValor;
		
	}
	
	
}
