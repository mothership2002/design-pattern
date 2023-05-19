package Singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void test() {
        System.out.println("test");
    }

}
