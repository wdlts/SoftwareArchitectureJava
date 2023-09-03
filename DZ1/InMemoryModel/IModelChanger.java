package DZ1.InMemoryModel;

public interface IModelChanger {

    void notifyChange();

    void RegisterModelChanger(IModelChangedObserver o);
    void RemoveModelChanger(IModelChangedObserver o);
}
