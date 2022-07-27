
public class CriaConta {
	public static void main(String[]arg) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("O saldo da primeira conta é " + primeiraConta.saldo);
		System.out.println("O saldo da segunda conta é " + segundaConta.saldo);
		
		
		
		
		segundaConta.agencia = 146;
		
		System.out.println("Agencia primeira conta " +  primeiraConta.agencia );
		System.out.println("Agencia segunda Conta " + segundaConta.agencia);
		
		
		
	}
}
