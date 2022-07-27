
public class TestaBanco {
	
	public static void main(String[]args) {
		Cliente edilson = new Cliente();
		edilson.nome = "Edilson";
		edilson.cpf = "12345678900";
		edilson.profissao = "programador";
		
		System.out.println(edilson);
		
		ContaTeste contaDoEdilson = new ContaTeste();
		contaDoEdilson.deposita(1000);
		
		contaDoEdilson.titular = edilson;
		
		System.out.println(contaDoEdilson.blindaSaldo());
		
	}
}
