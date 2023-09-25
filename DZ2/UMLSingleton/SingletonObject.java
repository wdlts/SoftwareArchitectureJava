package DZ2.UMLSingleton;

public class SingletonObject {

    private static final SingletonObject object = new SingletonObject();

    private SingletonObject() {
    }

    public static SingletonObject getObject() {
        return object;
    }

    public void printMessage() {
        System.out.println("Singleton object");
    }
}
