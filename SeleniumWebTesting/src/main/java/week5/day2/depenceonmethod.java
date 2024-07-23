package week5.day2;

import org.testng.annotations.Test;

public class depenceonmethod {
	//@Test(dependsOnMethods="week5.day2.attribute.friedrice")
   @Test
   private void create(){
	// TODO Auto-generated method stub
    System.out.println("create trisa jeevapaul");
}
   @Test
   //@Test(dependsOnMethods={"create"}, alwaysRun = true)
   private void edit() {
	// TODO Auto-generated method stub
   System.out.println("edit");
}
   @Test(dependsOnMethods={"create"}, alwaysRun = true)
   private void duplicate() {
	// TODO Auto-generated method stub
   System.out.println("duplicate");
}
   

}
