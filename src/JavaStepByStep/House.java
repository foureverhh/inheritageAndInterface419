package JavaStepByStep;

public class House {
    private double length;
    private double width;
    private int floors;

    public double area() {
        return length*width*floors;
    }

    public House(){
    }

    public House(double l,double w,int f){
        setLength(l);
        setFloors(f);
        setWidth(w);
    }

    public void setLength(double l) {
        if(l>0)
         length = l;
        else
            throw new IllegalArgumentException("Length is negative");
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getFloors() {
        return floors;
    }
}
