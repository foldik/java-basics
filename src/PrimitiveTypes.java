public class PrimitiveTypes {

    public static void main(String[] args) {
        boolean aBoolean = true;
        System.out.println(aBoolean);

        byte aByte = 127;
        System.out.println(aByte);

        short aShort = 2000;
        System.out.println(aShort);

        int anInt = 301210;
        System.out.println(anInt);

        long aLong = 23012020120132423L;
        System.out.println(aLong);

        float aFloat = 3212.202F;
        System.out.println(aFloat);

        double aDouble = 78687887.23123123;
        System.out.println(aDouble);

        char aChar = 'a';
        System.out.println(aChar);

        /*
            I'm a bit of a liar because String is not a primitive type
            but for simplicity we will consider it as it is.
        */
        String text = "Something long text about the meaning of life";
        System.out.println(text);
    }
}
