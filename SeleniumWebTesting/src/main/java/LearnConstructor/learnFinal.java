package LearnConstructor;

public class learnFinal{
		int rollnumber;
		String name;
		final float fees=5000;
		public learnFinal(int rollnumber,String name) {
			this.rollnumber=rollnumber;
			this.name=name;
		   }
		public void register() {
			System.out.println(rollnumber+name+fees);
		
	}
		public static void main(String[] args) {
			learnFinal	s1=new learnFinal(901,"Trisa");
			learnFinal  s2=new learnFinal(902,"Jo");
			s1.register();
			s2.register();
		}

}
