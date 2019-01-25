// package parth;


class BasicThread implements Runnable {


    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Processing...  BasicThread");
        }
        /*	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();*/
    }
}




class ThreadExample {

    public static void main(String[] args) {
        BasicThread bt = new BasicThread();
        Thread t = new Thread(bt);
        t.start();
	try {
        	Thread.sleep(1);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
        for (int i = 0; i < 1000; i++) {
            System.out.println("Processing...  Main thread");
        }
    }
}
