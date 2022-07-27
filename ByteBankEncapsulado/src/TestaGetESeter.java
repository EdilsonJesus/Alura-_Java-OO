
public class TestaGetESeter {
	public static void main(String[]args) {
		Conta conta = new Conta(1377, 21223);
//		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente fulano = new Cliente();
		
		
		fulano.setNome("Edilson");
		conta.setTitular(fulano);
//		fulano.setTitular("Edilson");
	}
}
