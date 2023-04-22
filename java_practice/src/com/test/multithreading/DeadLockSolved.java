package com.test.multithreading;

public class DeadLockSolved {
	public static void main(String ar[]) {
		DeadLockSolved test = new DeadLockSolved();

		final resource1 a = test.new resource1();
		final resource2 b = test.new resource2();

		// Thread-1
		Runnable b1 = new Runnable() {
			public void run() {
				synchronized (b) {
					try {
						/*
						 * Adding delay so that both threads can start trying to
						 * lock resources
						 */
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// Thread-1 have resource1 but need resource2 also
					synchronized (a) {
						System.out.println("In block 1");
					}
				}
			}
		};

		// Thread-2
		Runnable b2 = new Runnable() {
			public void run() {
				synchronized (b) {
					// Thread-2 have resource2 but need resource1 also
					synchronized (a) {
						System.out.println("In block 2");
					}
				}
			}
		};

		new Thread(b1).start();
		new Thread(b2).start();
	}

	// resource1
	private class resource1 {
		private int i = 10;

		@SuppressWarnings("unused")
		public int getI() {
			return i;
		}

		@SuppressWarnings("unused")
		public void setI(int i) {
			this.i = i;
		}
	}

	// resource2
	private class resource2 {
		private int i = 20;

		@SuppressWarnings("unused")
		public int getI() {
			return i;
		}

		@SuppressWarnings("unused")
		public void setI(int i) {
			this.i = i;
		}
	}
}