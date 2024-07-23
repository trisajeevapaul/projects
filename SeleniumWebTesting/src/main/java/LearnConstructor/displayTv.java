package LearnConstructor;

public class displayTv {
	String channel;
	String program;
private void display() {
	System.out.println("channel==>" +channel);
	//System.out.println("program--->" +program);

}	
public static void main(String[] args) {
	displayTv channel=new displayTv();
	displayTv program=new displayTv();
	channel.display();
	program.display();
}

}
