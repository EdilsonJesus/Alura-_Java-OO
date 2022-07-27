
 class ContaTeste {
	 private double saldo;
	 int agencia;
	 int numero;
	Cliente titular;
	 
	 public void deposita(double valor) {
		 this.saldo = saldo + valor;
	 }
	 
	 
	 public boolean saca(double valor) {
		 if(this.saldo >= valor) {
			 this.saldo -= valor; 
			 System.out.println("Saque efetuado com sucesso");
			 return true;
		 } else {
			 System.out.println("Saldo insulficiente");
			 return false;
		 }
	 }
	 
	 public boolean transfere(double valor, ContaTeste destino) {
		 if(this.saldo >= valor) {
			 this.saldo -= valor;
			 destino.deposita(valor);
			 return true;
		 }
		 
		 return false;
	 }
	 
	 public double blindaSaldo() {
		 return this.saldo;
	 }

}
