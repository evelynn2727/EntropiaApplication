package tools;

import java.util.stream.IntStream;

public class MathematicalCalculation {

    public static double log2(double value)
    {
        return (Math.log(value) / Math.log(2));
    }

    public static void calculateProbabilityLetters(Data data){
        for (Character character : data.NumberOfOccurrencesOfTheCharacter.keySet()) {
            double probability = (double)data.NumberOfOccurrencesOfTheCharacter.get(character) / data.message.length();
            Display.probabilityLetter(character,probability);
            data.result += probability*(log2(probability));
        }
    }

    public static int numberOfSameCharacter(String message, char letter)
    {
        int result = 0;
        char charMessage;
        int i = 0 ;

        if (i < message.length()) {
            do {
                charMessage = message.charAt(i);
                if (charMessage == letter) {
                    result++;
                }
                i++;
            } while (i < message.length());
        }
        return result;
    }

    public static void calculateProbability(Data data){

        for(int x = 0; x < data.numberOfLettersInMessage - 1; x++){
            for(int y = x + 1; y < data.numberOfLettersInMessage; y++){
                if(data.elementMessageWithoutRepeat[x] == data.elementMessageWithoutRepeat[y]){
                    if (data.elementMessageWithoutRepeat.length - 1 - y >= 0) System.arraycopy(data.elementMessageWithoutRepeat,
                            y + 1, data.elementMessageWithoutRepeat, y, data.elementMessageWithoutRepeat.length - 1 - y);
                    data.numberOfLettersInMessage--;
                    y--;
                }
            }
        }
        char[] temporaryArray = new char[data.numberOfLettersInMessage];

        System.arraycopy(data.elementMessageWithoutRepeat, 0, temporaryArray, 0, temporaryArray.length);

        data.elementMessageWithoutRepeat = temporaryArray;

        IntStream.range(0, data.numberOfLettersInMessage).forEach(i -> {
            data.charNumber = MathematicalCalculation.numberOfSameCharacter(data.message, data.elementMessageWithoutRepeat[i]);
            data.NumberOfOccurrencesOfTheCharacter.put(data.elementMessage[i], data.charNumber);
        });
    }
}