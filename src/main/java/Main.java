import tools.Data;
import tools.Display;
import tools.MathematicalCalculation;

public class Main {

    public static void main(String[] args) {
        Data data = new Data();

        Display.WelcomeMessage();
        data.setMessage();

        MathematicalCalculation.calculateProbability(data);

        Display.letterAndNumbersOccurrences(data);
        Display.probabilityLetterMessage();

        MathematicalCalculation.calculateProbabilityLetters(data);

        Display.results(data);
        Display.waitForKey();
    }
}