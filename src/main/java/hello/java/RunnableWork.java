package hello.java;

public class RunnableWork implements Runnable {

	int status = 0;

	public int getStatus() {
		return status;
	}

	@Override
	public void run() {
		status = 1;

		try {
			for (int n = 0; n < 10; n++) {
				this.status++;
				System.err.println(status);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		status = 999;

	}

}
