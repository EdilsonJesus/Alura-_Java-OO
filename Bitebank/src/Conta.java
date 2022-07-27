
class Conta {
    double saldo;
    int agencia;
    int numero; 
	String titular; 
	
	
	public void deposita(double valor) {
		this.saldo = saldo + valor;
	}
	
	 public boolean   saca(double valor){
		if(this.saldo >= valor ) {
			this.saldo -= valor;			
			System.out.println("Saque efetuado com sucesso ");
			return true;
		} else {
			System.out.println("Saldo insulficiênte");
			return false;
		}
	}
	 
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		
		return false;
	}
	
}
