package DZ1.InMemoryModel;

public class Observer1 implements IModelChangedObserver {
    @Override
    public void applyUpdateModel() {
        System.out.println("New model 1 added - Observer1");
    }
}
