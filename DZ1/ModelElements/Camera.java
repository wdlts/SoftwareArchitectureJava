package DZ1.ModelElements;

import java.util.List;

public class Camera {
    //TODO

    private List<Point3D> location;
    private List<Angle3D> angle3D;

    public List<Point3D> getLocation() {
        return location;
    }
    public List<Angle3D> getAngle3D() {
        return angle3D;
    }

    public Camera(List<Point3D> location, List<Angle3D> angle3D) {
        this.location = location;
        this.angle3D = angle3D;
    }

    public void rotate(Angle3D angle){

    }

    public void move (Point3D point){

    }


}
