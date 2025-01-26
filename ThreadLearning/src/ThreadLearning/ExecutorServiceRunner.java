package ThreadLearning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	private int taskNo;

	public Task(int no) {
		this.taskNo = no;
	}

	public void run() {
		System.out.println("\n Task " + this.taskNo + " Started");
		for (int i = this.taskNo * 100; i <= this.taskNo * 100 + 99; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task " + this.taskNo + " Completed");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		executorService.execute(new Task(8));
		executorService.execute(new Task(9));
		executorService.execute(new Task(10));
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		executorService.execute(new Task1());
//		executorService.execute(new Task2());
//		executorService.execute(new Thread(new Task4()));
		executorService.shutdown();
	}
}
