package JavaStepByStep;

public class Main {

    public static void main(String[] args) {
	    House house = new House(20,10,3);
	    LivingHouse livingHouse = new LivingHouse();
	    //house.length = 20;
	    //livingHouse.length = 25;
	    livingHouse.dividable = true;
	    livingHouse.divide();
	    double area1 = house.area();
	    double area2 = livingHouse.area();

	    ManyFamilyHouse manyFamilyHouse = new ManyFamilyHouse(20.0,10.0,3);
	    boolean check1 = house instanceof LivingHouse;
        System.out.println("Is house an instance of livingHouse "+check1);
        boolean check2 = livingHouse instanceof House;
		System.out.println("Is livingHouse an instance of House "+check2);

		//house.width=10;house.length=20;house.floors=3;
		//manyFamilyHouse.width=10;manyFamilyHouse.length=20;manyFamilyHouse.floors=3;

		System.out.println(house.area());
		System.out.println(manyFamilyHouse.area());
		House house1;
		house1 =  manyFamilyHouse;
		System.out.println(house1.area());

		//Object collection
		House[] houses = new House[100];
		houses[0] = new House(40,25,4);
		houses[1] = new LivingHouse(40,25,4,true);
		houses[2] = new ManyFamilyHouse(40,25,4,true,10);

		for(int i=0; i<houses.length;i++){
			if(houses[i]!= null)
				System.out.println("A "+houses[i].getClass().getName()+" with area "+houses[i].area());
		}

    }
}
