package JavaStepByStep;

public class ManyFamilyHouse extends LivingHouse {
    int amountOfApartment;
    public static final double rentalPerMonth = 2000;

    public ManyFamilyHouse(){}
    public ManyFamilyHouse(double l,double w,int f){
        super(l,w,f);
    }
    public ManyFamilyHouse(double l, double w, int f, boolean d, int a){
        super(l,w,f,d);
        amountOfApartment = a;

    }
    public double countingRentalIncome(){
        return area()*rentalPerMonth;
    }


    @Override
    public double area(){
        return getLength()*getWidth()*getFloors()*0.95;
    }
}
