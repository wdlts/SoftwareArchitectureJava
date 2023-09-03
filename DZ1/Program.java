package DZ1;

import DZ1.InMemoryModel.ModelStore;
import DZ1.InMemoryModel.Observer1;
import DZ1.ModelElements.Poligon;
import DZ1.ModelElements.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);
        Poligon poligon1 = new Poligon();
        List<Poligon> poligonList = new ArrayList<>();
        poligonList.add(poligon1);
        PoligonalModel poligonalModel1 = new PoligonalModel(poligonList);
        store.add(poligonalModel1);
    }
}
