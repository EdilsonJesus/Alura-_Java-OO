
public class TestaContaSemCliente {
	public static void main(String[]args) {
		ContaTeste clienteNovo = new ContaTeste();
		System.out.println(clienteNovo.blindaSaldo());
		
	    System.out.println(clienteNovo.titular);
		clienteNovo.titular.nome = "Novato";
		System.out.println(clienteNovo.titular.nome);
	}
}
