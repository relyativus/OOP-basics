package co.inventorsoft.oop.basic.overloading;

class Vararg {
    static void vararg(long... x) {
        System.out.println("long...");
    }

    static void vararg(Integer... x) {
        System.out.println("Integer...");
    }

    public static void main(String[] args) {
        int i = 5;
        //vararg(i, i);     // needs to box and use var-args
    }
}
