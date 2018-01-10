package co.inventorsoft.oop.basic.overloading;

/**
 * @author anatolii vakaliuk
 */
public class ArraysVsVararg {

    private static void print(final String ... args) {
        System.out.println("string vararg");
    }

    private static void print(final Object[] args) {
        System.out.println("object array");
    }

    public static void main(String[] args) {
        final String[] array = {"a", "b"};
        print(array);
    }
}
