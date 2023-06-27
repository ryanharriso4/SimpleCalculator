import java.util.regex.Pattern;
import java.util.InputMismatchException;
import java.util.regex.Matcher;

public class Calculation {
    int operand1;
    int operand2;
    char operator;

    public Calculation() {
        operand1 = 0;
        operand2 = 0;
        operator = '0';
    }

    public int solve(String input) {
        int position = 0;
        Pattern p = Pattern.compile("[\\+\\*/-]");
        Matcher matcher = p.matcher(input);
        if (matcher.find()) {
            position = matcher.start();
        }

        /*
         * System.out.println(input.substring(0, position));
         * System.out.println(input.charAt(position));
         * System.out.println(input.substring(position + 1, input.length()));
         */
        int opp1 = Integer.parseInt(input.substring(0, position));
        char operator = input.charAt(position);
        int opp2 = Integer.parseInt(input.substring(position + 1, input.length()));

        if (operator == '+')
            return opp1 + opp2;
        else if (operator == '-')
            return opp1 - opp2;
        else if (operator == '*')
            return opp1 * opp2;
        else {
            if (opp2 == 0)
                throw new ArithmeticException("Attempted to divide by 0");
            return opp1 / opp2;
        }

    }
}