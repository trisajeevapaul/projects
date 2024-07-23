package LearnConstructor;
//overloading parametrization
public class car {
	String name;
	int id;
	int age;
public car(String n,int i) {
	name=n;
	id=i;
}	
public car(String n,int i,int a) {
	name=n;
	id=i;
	age =a;
}
private void drive() {
	System.out.println(name+  id+  age);

}
public static void main(String[] args) {
	car brake=new car("trisa",901);
	car accilator=new car("jona",902,21);
	brake.drive();
	accilator.drive();
}
}
