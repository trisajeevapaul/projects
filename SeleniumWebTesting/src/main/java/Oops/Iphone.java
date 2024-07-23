package Oops;

public class Iphone extends Ios {
	public void makecall() {
	System.out.println("Call sneha");	// TODO Auto-generated method stub

	}
	public void sendsms() {
	System.out.println("Happy Birthday");	// TODO Auto-generated method stub

	}
	public void increaseVolume() {
        System.out.println("Iam increasing my  phone volume");		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Ios obj=new Iphone();
		Ios ob2=new Ipad();
		obj.increaseVolume();
		ob2.increaseVolume();

	}
	//Iphone obj=new Iphone();
	

}
