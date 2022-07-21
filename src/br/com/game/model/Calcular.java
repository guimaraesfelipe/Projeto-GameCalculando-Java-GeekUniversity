package br.com.game.model;

import java.util.Random;

public class Calcular {
	private int dificuldade;
	private int valor1;
	private int valor2;
	private int operacao;
	private int resultado;

	public Calcular(int dificuldade) {

		Random rand = new Random();

		this.operacao = rand.nextInt(4); // 0 - somar, 1 subtrair, 2 - multiplicar, 3 - dividir
		this.dificuldade = dificuldade;

		if (dificuldade > 0 && dificuldade <= 4) {
			switch (dificuldade) {
			case 1: // fácil
				this.valor1 = rand.nextInt(10);
				this.valor2 = rand.nextInt(10);
				break;

			case 2: // médio
				this.valor1 = rand.nextInt(100);
				this.valor2 = rand.nextInt(100);
				break;

			case 3: // dificil
				this.valor1 = rand.nextInt(1000);
				this.valor2 = rand.nextInt(1000);
				break;

			case 4: // muito dificil
				this.valor1 = rand.nextInt(10000);
				this.valor2 = rand.nextInt(10000);
				break;
			}

		} else {
			System.out.println("Nível de dificuldade invalida.");
		}

	}

	public int getDificuldade() {
		return dificuldade;
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getOperacao() {
		return operacao;
	}

	public int getResultado() {
		return resultado;
	}

	@Override
	public String toString() {
		String fase = "Operação desconhecida.";

		switch (this.getOperacao()) {
		case 0:
			fase = "Soma";
			break;
		case 1:
			fase = "Subtração";
			break;
		case 2:
			fase = "Multiplicação";
			break;
		case 3:
			fase = "Divisão";
			break;
		}

		return "Valor 1: " + this.getValor1() + "\nValor 2: " + this.getValor2() + "\nDificuldade: "
				+ this.getDificuldade() + "\nOperação: " + fase;
	}

	public boolean somar(int resposta) {
		this.resultado = getValor1() + getValor2();

		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());

		if (resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			return true;
		} else {
			System.err.println("Resposta incorreta!");
			return false;
		}
	}

	public boolean subtrair(int resposta) {
		this.resultado = getValor1() - getValor2();

		System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());

		if (resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			return true;
		} else {
			System.err.println("Resposta incorreta!");
			return false;
		}
	}

	public boolean multiplicar(int resposta) {
		this.resultado = getValor1() * getValor2();

		System.out.println(this.getValor1() + " x " + this.getValor2() + " = " + this.getResultado());

		if (resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			return true;
		} else {
			System.err.println("Resposta incorreta!");
			return false;
		}
	}

	public boolean dividir(int resposta) {
		this.resultado = getValor1() / getValor2();

		System.out.println(this.getValor1() + " / " + this.getValor2() + " = " + this.getResultado());

		if (resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			return true;
		} else {
			System.err.println("Resposta incorreta!");
			return false;
		}
	}

}
