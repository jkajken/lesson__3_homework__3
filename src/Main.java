public class Main {
    public static void main(String[] args) {
        double[] numbers = {-1.1, 2.3, 5.1, 2.2, -5.1, -1.9, 1.2, 4.5, -9.9, 1.3, -5.5, 4.6, 9.5, -2.2, -3.3};
        double d = 0;
        double result =+ d;
        double number = 0;

        for (double i : numbers) {
            result += i;
            number++;
            if (i <= 0) {
                result = 0;
                number = 0;

                continue;
            }
            System.out.println("arithmetic average" + result / number);
        }
    }
}