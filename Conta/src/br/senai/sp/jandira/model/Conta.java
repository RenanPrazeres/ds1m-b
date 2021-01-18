package br.senai.sp.jandira.model;

public class Conta {

	public String tipo;
	private double saldo;
	public String numero;
	public String titular;
	public boolean ativa;
	public double chequeEspecial;
	
	public void depositar(double valorDeposito) {
		
		if ( valorDeposito < 0) {
			System.out.println("o valor tem que ser maior que zero!");
		} else {
			saldo = saldo + valorDeposito;
		}
		
	}
	
	public void consultarSaldo() {
		
		System.out.println("saldo da conta: " + saldo);
		System.out.println("saldo da conta: + limite: " + (saldo + chequeEspecial));
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void sacar(double valorDoSaque) {
		
		if ((saldo + chequeEspecial) >= valorDoSaque) {
			saldo -= valorDoSaque;
		} else {
			System.out.println("Saldo Insuficiente !");
		}
		
		
	}
	
	public void transferir() {
		
	}
	
}
