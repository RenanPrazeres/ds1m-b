package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta contaRenanPrazeres;
		Conta contaPedro;
		Conta contaDaAna;
		
		contaRenanPrazeres = new Conta();
		contaPedro = new Conta();
		contaDaAna = new Conta();
		
		//**CONTA RENAN PRAZERES
		
		contaRenanPrazeres.numero = "111-0";
		contaRenanPrazeres.titular = "RenanPrazeres";
		contaRenanPrazeres.tipo = "corrente";
		contaRenanPrazeres.ativa = true;
		contaRenanPrazeres.depositar(100);
		contaRenanPrazeres.consultarSaldo();
		contaRenanPrazeres.depositar(300);
		contaRenanPrazeres.consultarSaldo();
		contaRenanPrazeres.depositar(-50);
		contaRenanPrazeres.consultarSaldo();
		

		//*** CONTA PEDRO CABRAL
		contaPedro.numero = "222-0";
		contaPedro.titular = "Pedro Cabral";
		contaPedro.tipo = "Poupan�a";
		contaPedro.ativa = true;
		
		//*** ContaDaAna

		contaDaAna.titular = "Ana Gomes";
		contaDaAna.numero = "333-0";
		contaDaAna.tipo = "Corrente";
		contaDaAna.ativa = true;
		contaDaAna.chequeEspecial = 200;
		contaDaAna.depositar(100);
		contaDaAna.consultarSaldo();
		contaDaAna.depositar(30);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(50);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(500);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(50);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(80);
		contaDaAna.consultarSaldo();
		contaDaAna.depositar(100);
		contaDaAna.consultarSaldo();
		contaDaAna.getSaldo();
		
		int a = somar(10, 5);
		
	}
	
	public static int somar(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		return resultado;
		
	}

}
