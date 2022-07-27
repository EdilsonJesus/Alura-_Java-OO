
public class TesteValores {
	public static void main(String[]args) {
		Conta conta = new Conta(1337 , 24585);
	
		conta.deposita(300);
		
		System.out.println(conta.getSaldo());
		
		Conta conta2 = new Conta(1337, 221103);
		
		conta2.deposita(1000);
		
	}	
	
}
