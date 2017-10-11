public class LoopExample {

    public static void main(String[] args) {
        int maxNumber = 20;
        for (int i = 0; i < maxNumber; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < maxNumber; i++) {
            int square = i * i;
            System.out.println(i + " square is " + square);
        }

        int number = 0;
        while (number < maxNumber) {
            int cube = number * number * number;
            System.out.println(number + " cube is " + cube);
            number++; // This means to increase the value of number by one
        }

        int count = 2000;
        do {
            System.out.println(
                    "The condition below is not true but because do while" +
                    "investigates it second this command will be executed at first.");
        } while (count < maxNumber);

        /*
         This will be a real beauty :)
        */
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("|" + (Math.random() < 0.5692 ? " " : "O"));
            }
            System.out.print("|");
            System.out.println();
        }

    }
}
