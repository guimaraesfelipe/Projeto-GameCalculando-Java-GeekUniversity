package br.com.game.view;

import java.util.Scanner;
import br.com.game.model.Calcular;

public class Game {

	static Scanner sc = new Scanner(System.in);
	static int score = 0;
	static Calcular controller;

	public static void main(String[] args) {
		jogar();
	}

	public static void jogar() {
		System.out.println("Informe o nível de dificuldade desejado [1, 2, 3, 4]: ");
		int dificuldade = sc.nextInt();

		controller = new Calcular(dificuldade);

		System.out.println("Informe o resultado para a seguinte operação: ");

		switch (controller.getOperacao()) {
		case 0: // soma
			System.out.println(controller.getValor1() + " + " + controller.getValor2());
			if (controller.somar(sc.nextInt())) {
				score++;
			}
			break;
		case 1: // subtração
			System.out.println(controller.getValor1() + " - " + controller.getValor2());
			if (controller.subtrair(sc.nextInt())) {
				score++;
			}
			break;
		case 2: // multiplicação
			System.out.println(controller.getValor1() + " x " + controller.getValor2());
			if (controller.multiplicar(sc.nextInt())) {
				score++;
			}
			break;
		case 3: // divisão
			System.out.println(controller.getValor1() + " / " + controller.getValor2());
			if (controller.dividir(sc.nextInt())) {
				score++;
			}
			break;
		}

		System.out.println("Você tem " + score + " pontos(s).");

		System.out.println("Deseja continuar? [1 - Sim, 0 - Não]");
		int newgame = sc.nextInt();

		if (newgame == 1) {
			jogar();
		} else {
			System.out.println("Você fez " + score + " ponto(s).");
			System.out.println("Até a próxima");
			System.exit(0);

		}

	}

}
