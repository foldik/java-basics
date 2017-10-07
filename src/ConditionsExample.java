public class ConditionsExample {

    public static void main(String[] args) {
        boolean flag = true;
        if (flag) {
            System.out.println("This is a stupid example since this will be always true");
        }

        double flagNumber = Math.random();
        if (flagNumber < 0.59) {
            System.out.println("flagNumber < 0.59 is TRUE");
        } else {
            System.out.println("flagNumber < 0.59 is FALSE");
        }

        double flagOne = Math.random();
        double flagTwo = Math.random();
        if (flagOne + flagTwo > 1) {
            System.out.println("flagOne + flagTwo > 1 is TRUE");
        } else if (flagOne + flagTwo > 0.5) {
            System.out.println("flagOne + flagTwo > 0.5 is TRUE");
        } else if (flagOne + flagTwo <= 0.5 && flagOne + flagTwo >= 0) {
            System.out.println("flagOne + flagTwo <= 0.5 is TRUE");
        } else {
            System.out.println("I don't know what the hack are you doing but this is impossible");
        }

        String elvisOperatorExample = (Math.random() > 3.0 / Math.PI) ? "Value when the condition is true" : "... when ... is false";
        System.out.println(elvisOperatorExample);
    }
}
