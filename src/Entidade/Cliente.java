package Entidade;

public class Cliente {
	private int numConta;
	private String nome;
	private double saldo;
	
	public Cliente(int numConta, String nome, double depositoInicial) {
		
		this.numConta = numConta;
		this.nome = nome;
		deposito(depositoInicial);
		}
	public Cliente(int numConta, String nome) {
		
		this.numConta = numConta;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo=saldo+valor;
	}
	
	public void retirada(double valor) {
		saldo=saldo-valor-5.0;
	}
	
	public String toString() {
	
		return "conta: " + numConta + " nome: " + nome + " saldo: " + String.format("%.2f", (saldo));
		
	}
	
	
	
}
