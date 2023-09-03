package DZ1.ModelElements;

import java.util.List;

public class Flash {
    //TODO
    private List<Point3D> location;
    private List<Angle3D> angle3D;
    private List<Color> color;

    private List<Float> power;




    public Flash(List<Point3D> location, List<Angle3D> angle3D, List<Color> color, List<Float> power) {
        this.location = location;
        this.angle3D = angle3D;
        this.color = color;
        this.power = power;

    }


    public void rotate (Angle3D angle){

    }
    public void move (Point3D point){
        
    }


}
