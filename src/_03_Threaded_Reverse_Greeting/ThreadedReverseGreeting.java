package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	/* HINT: You will most likely need to do this with recursion */
	public static void main(String[] args) {
		int size = 5000;
		factorial(size, size);
	}
	/*static Runnable runnable = new Runnable() {
		public void run(){
			System.out.println("Hello from " + Thread.currentThread().getName());
		}
	};*/
	public static void factorial(int num, int total) {
		if (num==0) {
			return;
		}
		else {
			Runner run = new Runner();
			Thread thread = new Thread(run, "Thread " + num);
			thread.start();
			try {
				thread.sleep(total/num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			factorial((num-1), total);
			
		}
	}
}
