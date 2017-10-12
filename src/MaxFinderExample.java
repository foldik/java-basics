public class MaxFinderExample {

    public static void main(String[] args) {
        double[] numbers = {22.12312, 2123.2131, 32412.3243, 21.231, 3221.321, -3243.23423 + 3453432.3243, Math.random() * 66565656565.231};

        double max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
           if (numbers[i] > max) {
               max = numbers[i];
           }
        }

        System.out.print("MAX: " + max);
    }
}
