package JavaStepByStep;

public class LivingHouse extends House {
    boolean dividable;

    public LivingHouse(){

    }

    public LivingHouse(boolean d){
      dividable =d;
    }
    public LivingHouse(double l,double w, int f){
        super(l,w,f);
    }
    public LivingHouse(double l,double w,int f,boolean d){
        super(l,w,f);
        dividable=d;
    }
    public void divide() {
         dividable = true;
    }

}
