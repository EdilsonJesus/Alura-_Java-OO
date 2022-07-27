
public class TesteReferencia {

	public static void main(String[]arg) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo primeira conta" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo += 150; 
		
		System.out.println("Segunda conta "  + segundaConta.saldo);
		
		System.out.println("saldo atual primeira conta " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("mesmissima conta");
		}
		
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
