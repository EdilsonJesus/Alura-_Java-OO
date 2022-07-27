
 class Conta {
	 private double saldo;
	 private int agencia;
	 private int numero;
	 private Cliente titular;
	 private static int total;
	 
	 public Conta(int agencia , int numero) {
		 Conta.total++;
		 System.out.println("O numero total de conta é " + Conta.total);
		 this.agencia = agencia;
		 this.numero = numero;	
		 System.out.println("Contruir um objeto com a agencia " + this.agencia + 
				 " e com o numero " + this.numero );		
	 }
	  
	  public void deposita(double valor) {
		  this.saldo += valor; 
	  }
	  
	  public boolean saca(double valor) {
		  if(this.saldo >= valor) {
			  this.saldo -= valor;
			  System.out.println("Saque efetua com sucesso");
			  return true;
		  }else {
			  System.out.println("saldo insulficiente");
			  return false;
		  }
	  }
	  
	  public boolean transfere(double valor, Conta destino) {
		  if(this.saldo >= valor) {
			  this.saldo -= valor;
			  destino.saca(valor);
			  return true;
		  }
		  return false;
	  }
	
	  
	  public double getSaldo() {
		  return this.saldo;
	  }
	  
	  public int getNumero() {
		  return this.numero;
	  }
	  
	  // Funções que não retornam nada noa JAva são Void...
	  public void setNumero(int numero) {
		  this.numero = numero;
	  }
	  
	  public int getAgencia() {
		  return agencia;
	  }
	  
	  public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	  
	 public void setTitular(Cliente titular) {
		 this.titular = titular;
	 }
	 
	 public Cliente getTitular () {
		 return titular;
	 }
	  
	  
}
