/**
 * Created by Bartłomiej Skorowski on 21.01.2020.
 */
public class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 17.6;
        double b = 13.98;
        System.out.println(calculator.add(a, b));
        System.out.println(calculator.multiply(a, b));
        System.out.println(calculator.divide(a, b));



    }
}
