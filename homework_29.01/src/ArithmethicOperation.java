import java.util.Random;

public class ArithmethicOperation {

    public double number1;
    public double number2;

    public ArithmethicOperation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;

    }

    public double add() {
        double resultOfAdd = number1 + number2;
        return resultOfAdd;
    }

    public double sub() {
        double resultOfSub = number1 - number2;
        return resultOfSub;

    }

    public double multiply() {
        double resultOfMult = number1 * number2;
        return resultOfMult;
    }

    public double divide() {
        double resuilOfDiv = number1 / number2;
        return resuilOfDiv;

    }


    public static boolean isEven(double number1, double number2) {
        boolean isEven = (number1 % 2) + (number2 % 2) == 0;
        return isEven;

    }

}
