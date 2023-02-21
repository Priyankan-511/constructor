package boot;

import thing.pipe;

public class PipeRunner {

	public static void main(String[] args) {
		pipe pipe1 = new pipe();
		pipe1.setBrand("finolix");
		pipe1.setDaimeter(10);
		pipe1.setColour("white");
		pipe1.setPrice(1000);
		System.out.println(pipe1);

		pipe pipe2 = new pipe();
		pipe1.setBrand("finolix");
		pipe1.setDaimeter(10);
		pipe1.setColour("white");
		pipe1.setPrice(1000);

		System.out.println("hashcode is" + pipe1.hashcode() + "origin hashcode is " + System.identityHashCode(pipe2));

		System.out.println(pipe1.equals(pipe2));

	}
	

}