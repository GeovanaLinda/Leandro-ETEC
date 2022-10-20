package br.com.geovanag.projetoseguinte;

public class classePrincipal {

	public static void main(String[] args) {
		
		classeConta objetoConta1 = new classeConta(); //Instancia um objeto
		objetoConta1.atributoClienteConta = new classePessoa();
		
		objetoConta1.atributoClienteConta.atributoNomePessoa = "Caaaaaaa";
		objetoConta1.atributoClienteConta.atributoCPFPessoa = 1234;
		objetoConta1.atributoClienteConta.atributoRGPessoa = 546565;
		
		
	
		objetoConta1.atributoNumeroConta = 1234;
		//objetoConta1.atributoSaldoConta = 450000.00 + (450000.00 * 0.10); //10% 
		objetoConta1.metodoDepositar(450000.00);
		
		
		
		//System.out.println(objetoConta1.atributoNomeConta);
		System.out.println(objetoConta1.atributoNumeroConta);
		System.out.println(objetoConta1.atributoSaldoConta);
		
		classeConta objetoConta2 = new classeConta(); //Instancia um objeto
		
		objetoConta2.atributoClienteConta.atributoNomePessoa = "Gabi";
		objetoConta2.atributoClienteConta.atributoCPFPessoa = 4321;
		objetoConta2.atributoClienteConta.atributoRGPessoa = 52454;
		
		
	//	objetoConta2.atributoNomeConta = "Gabi";
		//objetoConta2.atributoNumeroConta = 4321;
		//objetoConta2.atributoSaldoConta = 14000.50;
		//objetoConta2.metodoDepositar(140000.50);
		
	//	System.out.println(objetoConta2.atributoNomeConta);
	//	System.out.println(objetoConta2.atributoNumeroConta);
	//	System.out.println(objetoConta2.atributoSaldoConta);
		
		
	}

}
