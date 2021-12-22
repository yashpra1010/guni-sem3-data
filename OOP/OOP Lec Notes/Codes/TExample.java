//EXAMPLE-1
/*
public class TExample extends Thread {
	public void run() {
		System.out.println("Thread is Running!!!");
	}

	public static void main(String[] args) {
		TExample t1 = new TExample();
		t1.start();
	}

}
*/
//EXAMPLE-2
/*
public class TExample implements Runnable {
	public void run() {
		System.out.println("Thread is Running!!!");
	}
	
	public static void main(String[] args) {
		TExample t1 = new TExample();
		Thread td = new Thread(t1);
		td.start();
	}
	
}
*/

//EXAMPLE-3
/*
class MultithreadingDemo extends Thread{
	public void run(){
		System.out.println("Thread is running "+Thread.currentThread().getId());
	}
}
//public class Multithread
public class TExample {
	public static void main(String[] args) {
		int n=8;
		for (int i = 0; i < n; i++) {
			MultithreadingDemo obj = new MultithreadingDemo();
			obj.start();
		}
	}
}
*/

//EXAMPLE-4 -> public class ThreadPrograms

/*
class MultithreadingDemo extends Thread{
	public void run(){
		for (int x = 1; x <=3; x++) {
			System.out.println("Thread class: "+x);
		}
	}
}
public class TExample {
	
	public static void main(String[] args) {
		MultithreadingDemo o = new MultithreadingDemo();
		o.start();
		for (int x = 11; x <= 13; x++) {
			System.out.println("Parent class: "+x);
		}
		System.out.println("Done");
	}
}
*/

//EXAMPLE-5 -> public class ThreadPrograms: sleep()
/*
class MultithreadingDemo extends Thread{
	public void run(){
		for (int x = 1; x <=3; x++) {
			System.out.println("Thread class: "+x);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
public class TExample {

	public static void main(String[] args) {
		MultithreadingDemo o = new MultithreadingDemo();
		o.start();
		for (int x = 11; x <= 13; x++) {
			System.out.println("Parent class: "+x);
		}
		System.out.println("Done");
	}
}
*/
//EXAMPLE-6 -> public class ThreadPrograms: sleep()
/*
public class TExample extends Thread {
	public void run(){
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TExample t1=new TExample();
		TExample t2=new TExample();

		t1.start();
		t2.start();
	}
}
*/
//EXAMPLE-7 -> public class ThreadPrograms: calling run() directly
/*
public class TExample extends Thread {
	public void run(){
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TExample t1=new TExample();
		TExample t2=new TExample();

		t1.run();
		t2.run();
	}
}
*/