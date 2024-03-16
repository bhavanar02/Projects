import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator App!");
        System.out.println("Choose an action:");
        System.out.println("1 - Arithmetic Calculations\n2 - Scientific Calculations\n3 - Trigonometric Functions");

        int action = scanner.nextInt();
        performAction(action);

        System.out.println("Thank you for using the Calculator App!");
    }

    public static void performAction(int action) {
        Scanner scanner = new Scanner(System.in);
        BasicCalculator basicCalc = new BasicCalculator();
        ScientificCalculator scientificCalc = new ScientificCalculator();
        TrigonometricCalculator trigCalc = new TrigonometricCalculator();

        switch (action) {
            case 1:
                performBasicCalculations(basicCalc, scanner);
                break;
            case 2:
                performScientificCalculations(scientificCalc, scanner);
                break;
            case 3:
                performTrigonometricFunctions(trigCalc, scanner);
                break;
            default:
                System.out.println("Invalid action. Please try again.");
                int newAction = scanner.nextInt();
                performAction(newAction);
        }
    }

    public static void performBasicCalculations(BasicCalculator basicCalc, Scanner scanner) {
        System.out.println("Choose an operation:");
        System.out.println("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n5 - Modulo");

        int operation = scanner.nextInt();
        double firstNumber, secondNumber;

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextDouble();

        switch (operation) {
            case 1:
                System.out.println("Result: " + basicCalc.add(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println("Result: " + basicCalc.subtract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println("Result: " + basicCalc.multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println("Result: " + basicCalc.divide(firstNumber, secondNumber));
                break;
            case 5:
                System.out.println("Result: " + basicCalc.modulo(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Invalid operation. Please try again.");
                performBasicCalculations(basicCalc, scanner);
        }
    }

    public static void performScientificCalculations(ScientificCalculator scientificCalc, Scanner scanner) {
        System.out.println("Choose a scientific operation:");
        System.out.println("1 - Exponent\n2 - Logarithm");

        int operation = scanner.nextInt();
        double number;

        System.out.print("Enter the number: ");
        number = scanner.nextDouble();

        switch (operation) {
            case 1:
                System.out.println("Result: " + scientificCalc.exp(number));
                break;
            case 2:
                System.out.println("Result: " + scientificCalc.log(number));
                break;
            default:
                System.out.println("Invalid operation. Please try again.");
                performScientificCalculations(scientificCalc, scanner);
        }
    }

    public static void performTrigonometricFunctions(TrigonometricCalculator trigCalc, Scanner scanner) {
        System.out.println("Choose a trigonometric function:");
        System.out.println("1 - Sine\n2 - Cosine\n3 - Tangent\n4 - Arcsine\n5 - Arccosine\n6 - Arctangent");

        int operation = scanner.nextInt();
        double number;

        System.out.print("Enter the number: ");
        number = scanner.nextDouble();

        switch (operation) {
            case 1:
                System.out.println("Result: " + trigCalc.sine(number));
                break;
            case 2:
                System.out.println("Result: " + trigCalc.cosine(number));
                break;
            case 3:
                System.out.println("Result: " + trigCalc.tangent(number));
                break;
            case 4:
                System.out.println("Result: " + trigCalc.arcsine(number));
                break;
            case 5:
                System.out.println("Result: " + trigCalc.arccosine(number));
                break;
            case 6:
                System.out.println("Result: " + trigCalc.arctangent(number));
                break;
            default:
                System.out.println("Invalid operation. Please try again.");
                performTrigonometricFunctions(trigCalc, scanner);
        }
    }
}