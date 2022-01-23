package inputStreamPackage;

import java.util.ArrayList;

public class ThreadRacing implements Runnable{
	
	private int index;
	
	public ThreadRacing() {
		this.index = 0;
	}
	
	@Override
	public synchronized void run() {
		int value = Main.totalNumbers.get(this.index);
		
		if(value % 2 == 0) {
			Main.even.add(value);
		}else {
			Main.odd.add(value);
		}
		System.out.println("Even size: " + Main.even.size());
		System.out.println("Odd size: " + Main.odd.size());
		this.index++;
	}

}
