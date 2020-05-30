package ex.consistency;

public class ExampleMemoryConsistencyProblem {

	public static boolean  flag = false;
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				while(!flag) {

		           }
		           System.out.println("Hello World!");

		           while(flag) {

		           }
		           System.out.println("Good Bye!");
			}
		});
		
		thread.start();
		
		thread.sleep(1000);
		System.out.println("Say Hello..");
        flag = true;

        Thread.sleep(1000);
        System.out.println("Say Bye..");
        flag = false;
	}
}
