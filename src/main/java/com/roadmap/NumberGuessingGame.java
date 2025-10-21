package com.roadmap;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean continueGame = true;

    System.out.println("Bem-vindo ao jogo de adivinhação!");

    while (continueGame) {
      System.out.println("\n\nEu estou pensando em um número entre 1 e 100." +
          "\n" +
          "Escolha um nível de dificuldade: fácil (10 tentativas), médio (7 tentativas), difícil (5 tentativas)" +
          "\n" +
          "Por favor selecione a dificuldade do jogo:" +
          "\n" +
          "1 - Fácil\n" +
          "2 - Médio\n" +
          "3 - Difícil\n\n");
      System.out.print("Escolha o nivel: ");
      int difficultyLevel = sc.nextInt();
      int attempts = getAttempts(difficultyLevel);
      int secretNumber = generateSecretNumber();

      for (int i = 0; i < attempts; i++) {
        System.out.print("Escolha escolha um numero: ");
        int guess = sc.nextInt();
        if (guess == secretNumber) {
          System.out.println("Parabéns! Você acertou o número em " + (i + 1) + " tentativas.");
          break;
        } else if (guess < secretNumber) {
          System.out.println("Tente novamente. O número é maior.");
        } else {
          System.out.println("Tente novamente. O número é menor.");
        }
      }

      sc.nextLine();
      System.out.print("Deseja continuar? (y/n): ");
      String mustContinue = sc.nextLine();

      if (!mustContinue.equalsIgnoreCase("y")) {
        continueGame = false;
      }
    }
  }

  private static int generateSecretNumber() {
    Random random = new Random();
    return random.nextInt(100) + 1;
  }

  private static int getAttempts(int difficultyLevel) {
    switch (difficultyLevel) {
      case 1: return 10;
      case 2: return 7;
      case 3: return 5;
      default: return 0;
    }
  }

}

/*
When the game starts, it should display a welcome message along with the rules of the game.

The computer should randomly select a number between 1 and 100.

User should select the difficulty level (easy, medium, hard) which will determine the number of
chances they get to guess the number.

The user should be able to enter their guess.

If the user's guess is correct, the game should display a congratulatory message along with the number of
attempts it took to guess the number.

If the user's guess is incorrect, the game should display a message indicating whether the number is
greater or less than the user's guess.

The game should end when the user guesses the correct number or runs out of chances.
 */
