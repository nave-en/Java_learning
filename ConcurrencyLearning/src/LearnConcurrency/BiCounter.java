package LearnConcurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {
	private int i = 0;
	private int j = 0;
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	public void incI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}

	public void incJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}
//	synchronized public void incI() {
//		lockForI.lock();
//		i++;
//		lockForI.unlock();
//	}
//
//	synchronized public void incJ() {
//		lockForJ.lock();
//		j++;
//		lockForJ.unlock();
//	}
}
