
public class TestaNegativo {
	public static void main(String[]args) {
		ContaTeste umaConta = new ContaTeste();
		
		umaConta.deposita(100);
		
		System.out.println(umaConta.blindaSaldo());
		
		
		System.out.println(umaConta.blindaSaldo());
	}
}
