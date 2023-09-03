package DZ1.InMemoryModel;

public class Observer2 implements IModelChangedObserver {
    @Override
    public void applyUpdateModel() {
        System.out.println("New model 2 added - Observer2");
    }
}
