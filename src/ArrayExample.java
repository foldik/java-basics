public class ArrayExample {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2000, 3783, -62167};

        System.out.println("You can use for loop this way");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.print("\n\n");
        System.out.println("Or you can use the for each syntax");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        String[] texts = new String[10];
        texts[0] = "Start Wars 8";
        texts[1] = "I like java";
        texts[2] = "I hate java";
        texts[3] = "Wut";
        texts[4] = "Doh";

        System.out.print("\n\n");
        for (String text : texts) {
            System.out.print("[ " + text + " ] ");
        }

        int height = 5;
        int width = 4;
        boolean[][] booleanMatrice = new boolean[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                booleanMatrice[i][j] = Math.random() < 0.5961;
            }
        }

        System.out.print("\n\n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("|" + booleanMatrice[i][j]);
            }
            System.out.print("|\n");
        }

    }
}
