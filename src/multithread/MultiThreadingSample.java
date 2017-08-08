package multithread;



class RunDemo implements Runnable{
	String tname;
	Thread t;
	public RunDemo(String name) {
		tname = name;
		System.out.println("Creating thread: " + tname);
	}
	public void start() {
		System.out.println("Starting " + tname );
		t = new Thread(this, tname);
		t.start();
		
		
	}
	@Override
	public void run() {
		System.out.println("Starting " + tname);
		for(int i=4;i>=0;i--) {
			System.out.println(tname + " Still running ... " + i);
			try {
				System.out.println(tname + " Sleeping");
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Byeeeeeeee " + tname);
	}
	
}
public class MultiThreadingSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunDemo run1 = new RunDemo("Thread-1");
		run1.start();
		
		RunDemo run2 = new RunDemo ("Thread-2");
		run2.start();
	}

}
