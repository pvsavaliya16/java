class NewThread implements Runnable {
	
	public void run() {
		System.out.println("Processing..." + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Processing done");
	}
}

class ThreadExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(new NewThread(),"parth");
		t1.start();
	}
}