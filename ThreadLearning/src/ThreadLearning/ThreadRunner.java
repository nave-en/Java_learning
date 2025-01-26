package ThreadLearning;

class Task1 extends Thread {
	public void run() {
		System.out.println("Task1 started");
		for (int i = 100; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task1 done");
	}
}

class Task2 extends Thread {
	public void run() {
		System.out.println("Task2 started");
		for (int i = 200; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task2 done");
	}
}

class Task3 extends Thread {
	public void run() {
		System.out.println("Task3 started");
		for (int i = 300; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task3 done");
	}
}

class Task4 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task4 started");
		for (int i = 400; i <= 499; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task4 done");

	}
}

public class ThreadRunner {
	public static void main(String[] args) throws InterruptedException {
		Task1 task1 = new Task1();
		task1.start();
		task1.join();
		Task4 task4 = new Task4();
		Thread thread = new Thread(task4);
		thread.start();
		System.out.println("Main Completed");
//		Task2 task2 = new Task2();
//		task2.start();
//		Task3 task3 = new Task3();
//		task3.start();
//		System.out.println("Task 1 started");
//		for (int i = 100; i <= 200; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		System.out.println("Task 1 Completed");
//		System.out.println("Task 2 started");
//		for (int i = 201; i <= 300; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		System.out.println("Task 2 Completed");
//		System.out.println("Task 3 started");
//		for (int i = 301; i <= 400; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		System.out.println("Task 3 Completed");
//		System.out.println("Method completed");
	}

}
