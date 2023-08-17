// runtime means method overriding

class Bank{
	double ROI(){
		return 0;
	}
}

class SBI extends Bank{
	@Override
	double ROI(){
		double rate = 8.7;
		//Systen.out.println("The Rate of interest of SBI is "+rate);
		return rate;
	}
}

class AXIS extends Bank{
	@Override
	double ROI(){
		double rate = 9.8;
		//System.out.println("The Rate of interest of AXIS is "+rate);
		return rate;
	}
}

class Deutsche extends Bank{
	@Override
	double ROI(){
		double rate = 11.6;
		return rate;
	}
}

public class Runtime{
	public static void main(String[] args){
		Bank b1 = new SBI();  // upcasting
		Bank b2 = new AXIS();
		Bank b3 = new Deutsche();
		
		System.out.println("The Rate Of Interest of SBI is "+b1.ROI());
		System.out.println("The Rate Of Interest of AXIS is "+b2.ROI());
		System.out.println("The Rate Of Interest of Deutsche is "+b3.ROI());	
	}
}
