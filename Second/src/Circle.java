public class Circle {
    double r, x, y;
    Circle(){
        r = 5;
        x = 5;
        y = 5;
    }
    Circle(double rad){
        r = rad;
        x = 5;
        y = 5;
    }
    Circle(double x_, double y_){
        r = 5;
        x = x_;
        y = y_;
    }
    Circle(double rad, double x_, double y_){
        r = rad;
        x = x_;
        y = y_;
    }
    public void view(){
        System.out.println("Radius: " + r);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
    public void change_x_y(double x_, double y_){
        x = x_;
        y = y_;
    }
    public void change_radius(double rad){
        r = rad;
    }
    public void lenght(){
        System.out.println("Lenght " + 2*Math.PI*r);
    }
    public void square(){
        System.out.println("Square " + 2*Math.PI*r*r);
    }
}