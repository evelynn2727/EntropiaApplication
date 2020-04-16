package tools;

import java.io.IOException;

public class Display {
    public static void WelcomeMessage(){
        System.out.println(" _______   ________   _________  ________  ________  ________  ___  ________   ");
        System.out.println("|\\  ___ \\ |\\   ___  \\|\\___   ___\\\\   __  \\|\\   __  \\|\\   __  \\|\\  \\|\\   __  \\   ");
        System.out.println("\\ \\   __/|\\ \\  \\\\ \\  \\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\ \\  \\|\\  \\   ");
        System.out.println(" \\ \\  \\_|/_\\ \\  \\\\ \\  \\   \\ \\  \\ \\ \\   _  _\\ \\  \\\\\\  \\ \\   ____\\ \\  \\ \\   __  \\  ");
        System.out.println("  \\ \\  \\_|\\ \\ \\  \\\\ \\  \\   \\ \\  \\ \\ \\  \\\\  \\\\ \\  \\\\\\  \\ \\  \\___|\\ \\  \\ \\  \\ \\  \\ ");
        System.out.println("   \\ \\_______\\ \\__\\\\ \\__\\   \\ \\__\\ \\ \\__\\\\ _\\\\ \\_______\\ \\__\\    \\ \\__\\ \\__\\ \\__\\");
        System.out.println("    \\|_______|\\|__| \\|__|    \\|__|  \\|__|\\|__|\\|_______|\\|__|     \\|__|\\|__|\\|__|");
        System.out.println("Wprowadz dane do programu:");
    }

    public static void letterAndNumbersOccurrences(Data data){
        System.out.println("\nLiczba wystąpień poszczególnych liter w przekazanej wiadomośći:");
        System.out.println(data.NumberOfOccurrencesOfTheCharacter+"\n");
    }

    public static void probabilityLetterMessage(){
        System.out.println("Prawdopodobieństwo wystąpienia poszczególnych liter w wiadomośći:");
    }

    public static void probabilityLetter(Character character, double probability){
        System.out.println("Prawdopodobieństwo wystąpienia litery: "+character+ " to " + probability + " ( "+ (-probability*(MathematicalCalculation.log2(probability))) +" )");
    }

    public static void results(Data data){
        System.out.print("\nH(A)= "+ -data.result);
    }

    public static void waitForKey(){
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}