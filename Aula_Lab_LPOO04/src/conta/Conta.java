package conta;

public class Conta {
	
	private String nome;
	private int cpf;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		} else {
			System.out.println("Mermão, tu não tem grana");
		}
	}
	
	public void fazerPix(double valor, Conta contaDestinatario) {
		
			if (valor <= saldo) {
				saldo -= valor;
				contaDestinatario.depositar(valor);
			} else {
				System.out.println("Mermão, tu não tem grana");
			}
		
	}
	}
