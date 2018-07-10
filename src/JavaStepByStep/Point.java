package JavaStepByStep;

public class Point implements Printable,Drawable {
    public double x,y;

    public Point(){}
    public Point(double xx,double yy){
        x = xx;
        y = yy;
    }
    public Point(Point p){
        x = p.x;
        y = p.y;
    }
    @Override
    public String toString(){
        return "( "+x+" )"+", ( "+y+" )";
    }
    @Override
    public void printable() {
        System.out.println(toString());
        System.out.println("Override the abstract method from interface Printable");
    }

    @Override
    public void drawable() {
        System.out.println("Override the abstract method from interface Drawable");
    }
}
