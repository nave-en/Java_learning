package LearnConcurrency;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		c1.increment();
		c2.increment();
		c3.increment();
		System.out.println("I value : " + c1.getI());
		System.out.println("I value : " + c2.getI());
		System.out.println("I value : " + c3.getI());

		BiCounter bi1 = new BiCounter();
		BiCounter bi2 = new BiCounter();
		BiCounter bi3 = new BiCounter();
		bi1.incI();
		bi2.incI();
		bi3.incI();
		bi1.incJ();
		bi2.incJ();
		bi3.incJ();
		System.out.println("Bi1 I value : " + bi1.getI());
		System.out.println("Bi2 I value : " + bi2.getI());
		System.out.println("Bi3 I value : " + bi3.getI());
		System.out.println("Bi1 J value : " + bi1.getJ());
		System.out.println("Bi2 J value : " + bi2.getJ());
		System.out.println("Bi3 J value : " + bi3.getJ());
	}
}
