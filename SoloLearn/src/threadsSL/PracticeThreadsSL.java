package threadsSL;

class Loader extends Thread{
	public void run() {
		System.out.println("Mother");
	}
}

public class PracticeThreadsSL {
	
	public static void main(String[] args) {
		
		Loader loaderObj = new Loader();
		
		loaderObj.start();
		loaderObj.run();
	}
	
}
