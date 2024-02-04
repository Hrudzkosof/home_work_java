import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        ArithmethicOperation arithmethicOperation = new ArithmethicOperation(number1, number2);
        double resultOfAdd = arithmethicOperation.add();
        System.out.println(resultOfAdd);

        double resultOfSub = arithmethicOperation.sub();
        System.out.println(resultOfSub);

        double resultOfMult = arithmethicOperation.multiply();
        System.out.println(resultOfMult);

        double resultOfDiv = arithmethicOperation.divide();
        System.out.println(resultOfDiv);

        boolean isEven = arithmethicOperation.isEven(number1,number2);

        System.out.println(isEven);

        }

}



