package week1.day1;

public class Mobile {
 public void makecall() {
	 
	   String mobileModel = "SamsungS";
	   float mobileWeight = 2.0f;
	   System.out.println(mobileModel);
	  System.out.println(mobileWeight);
 }
  public void sendsms() {
	  boolean isFullCharged = true;
	  int mobileCost = 9999;
	  System.out.println(isFullCharged);
	  System.out.println(mobileCost);
  }
  public static void main(String[]agrs) {
	  Mobile obj = new Mobile();
	  obj.makecall();
	  obj.sendsms();
	  System.out.println("This is my mobile");
	  
	  
	  
	   
	   
	   
 }
}
