package entidade;

public class ContaCliente {

	private int numero;
	private String titular;
	private double saldo;
	
	public ContaCliente(int numero,String titular) {
		this.numero = numero;
		this.titular = titular;
		
	}
	public ContaCliente(int numero,String titular,double inicialDeposito) {
		this.numero = numero;
		this.titular = titular;
		deposito (inicialDeposito);
	}
	public int getNumero() {
		return numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposito(double montante) {
		saldo += montante;
	}
	public void saque(double montante) {
		saldo -= montante + 5.0;
	}
	public String toString() {
		return "conta " + numero + " ,titular: " + titular + ", saldo: $ " + String.format("%.2f", saldo); 
	}
}
