package hello.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HelloMultiThread2 {

	public static void main(String[] args) throws Exception {

		RunnableWork work = new RunnableWork();

		ExecutorService es = Executors.newFixedThreadPool(2);
		try {
			es.execute(work);
			System.err.println("hi 1");

		} finally {
			System.err.println("hi 2");
			es.shutdown();
			System.err.println("hi 3");
			es.awaitTermination(1, TimeUnit.MINUTES);
			System.err.println("hi 4");
		}
	}

}
