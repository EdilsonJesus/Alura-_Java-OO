
public class TestaMetodo {
	public static void main(String[]args) {
		Conta contaCliente1 = new Conta();
		
		contaCliente1.deposita(50);
		
		System.out.println(contaCliente1.saldo);
		
		contaCliente1.saca(51);
		System.out.println(contaCliente1.saldo);
		
		Conta contaCliente2 = new Conta();		
		contaCliente2.deposita(900);
		
		contaCliente2.transfere(350,  contaCliente1);
		System.out.println(contaCliente2.saldo);
		System.out.println(contaCliente1.saldo);
		
		
	}

}
