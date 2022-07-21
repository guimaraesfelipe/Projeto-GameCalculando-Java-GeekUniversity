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
		System.out.println("Informe o n�vel de dificuldade desejado [1, 2, 3, 4]: ");
		int dificuldade = sc.nextInt();

		controller = new Calcular(dificuldade);

		System.out.println("Informe o resultado para a seguinte opera��o: ");

		switch (controller.getOperacao()) {
		case 0: // soma
			System.out.println(controller.getValor1() + " + " + controller.getValor2());
			if (controller.somar(sc.nextInt())) {
				score++;
			}
			break;
		case 1: // subtra��o
			System.out.println(controller.getValor1() + " - " + controller.getValor2());
			if (controller.subtrair(sc.nextInt())) {
				score++;
			}
			break;
		case 2: // multiplica��o
			System.out.println(controller.getValor1() + " x " + controller.getValor2());
			if (controller.multiplicar(sc.nextInt())) {
				score++;
			}
			break;
		case 3: // divis�o
			System.out.println(controller.getValor1() + " / " + controller.getValor2());
			if (controller.dividir(sc.nextInt())) {
				score++;
			}
			break;
		}

		System.out.println("Voc� tem " + score + " pontos(s).");

		System.out.println("Deseja continuar? [1 - Sim, 0 - N�o]");
		int newgame = sc.nextInt();

		if (newgame == 1) {
			jogar();
		} else {
			System.out.println("Voc� fez " + score + " ponto(s).");
			System.out.println("At� a pr�xima");
			System.exit(0);

		}

	}

}
