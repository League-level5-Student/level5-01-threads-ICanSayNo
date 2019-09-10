package _03_Threaded_Reverse_Greeting;

public class Runner implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from " + Thread.currentThread().getName());
	}

}
