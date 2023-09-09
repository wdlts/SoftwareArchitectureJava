package DZ3;

public class CarWash implements CarWashing {


    @Override
    public void wash(WashType washType) {
        switch (washType){
            case Luxury -> System.out.println("Мойка-Люкс");
            case BasePlusRags -> System.out.println("Базовая мойка и коврики");
            case Base -> System.out.println("Базовая мойка");
        }
    }



}
