package tools;

import java.util.HashMap;
import java.util.Scanner;

public class Data {

    private Scanner scanner;

    public String message;
    public int numberOfLettersInMessage;

    public char[] elementMessage;
    public char[] elementMessageWithoutRepeat;

    public int charNumber;
    public double result;
    public HashMap<Character, Integer> NumberOfOccurrencesOfTheCharacter;

    public Data() {
        scanner = new Scanner(System.in);
        NumberOfOccurrencesOfTheCharacter = new HashMap<>();
        charNumber = 0;
        result = 0;
    }

    public void setMessage(){
        message = scanner.nextLine().replace(" ","").toLowerCase();
        numberOfLettersInMessage = message.length();
        elementMessage = message.toCharArray();
        elementMessageWithoutRepeat = elementMessage;
    }
}