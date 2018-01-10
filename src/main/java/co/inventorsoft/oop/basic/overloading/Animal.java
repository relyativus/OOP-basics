package co.inventorsoft.oop.basic.overloading;

class Animal {
    static void eat() {
    }
}

class Dog3 extends Animal {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.go(d);              // is this legal ?
    }

    void go(Animal a) {
    }
}
