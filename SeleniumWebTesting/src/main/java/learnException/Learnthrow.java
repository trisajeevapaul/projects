package learnException;

import javax.management.RuntimeErrorException;

public class Learnthrow {
	private static void run() {
		//we can use throw where the exception we have provide information
		throw new RuntimeErrorException(null,"user message");

	}
	public static void main(String[] args) {
		run();
	}

}
