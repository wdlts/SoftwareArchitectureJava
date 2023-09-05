package DZ2.UMLSingleton;

public class SingletonUsage {

    public static void main(String[] args) {
        SingletonObject singleObject = SingletonObject.getObject();
        singleObject.printMessage();
    }


}
