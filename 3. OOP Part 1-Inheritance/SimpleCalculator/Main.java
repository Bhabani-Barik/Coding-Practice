package SimpleCalculator;

public class Main {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber((4));
        System.out.println("add:: " + calculator.getAdditionResult());

        System.out.println("substract:: " + calculator.getSubtractionResult());

        System.out.println("multiply:: " + calculator.getMultiplicationResult());

        System.out.println("divide:: " + calculator.getDivisionResult());

    }
}
