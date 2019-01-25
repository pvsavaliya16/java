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

    public static void main(String[] args) throws Exception {
        BasicThread bt = new BasicThread();
        Thread t = new Thread(bt);
        t.start();
        Thread.sleep(1);
        for (int i = 0; i < 1000; i++) {
            System.out.println("Processing...  Main thread");
        }

    }
}
