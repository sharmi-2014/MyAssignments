package week1.day1;
  class car{
	  public void applyBreak() {
		  System.out.println("Applied break");
	  }
	  public void soundHorn() {
		  System.out.println("soundhorn");
	  }
	  
	  
  }
public class Bike {
	public void speedoMeter(){
		System.out.println("Display speedometer");
	}
	public static void main(String[]agrs) {
		car obj=new car();
		obj.applyBreak();
		obj.soundHorn();
		Bike and=new Bike();
		and.speedoMeter();
		
	}

}
