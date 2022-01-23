package inputStreamPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	static ArrayList<Integer> even = new ArrayList<>();
	static ArrayList<Integer> odd = new ArrayList<>();
	static ArrayList<Integer> totalNumbers = new ArrayList<>(10000);

	public static void main(String[] args){
		
		for (int i = 1; i <= 10_000; i++) {
            totalNumbers.add(i);
        }
		
		ThreadRacing t1 = new ThreadRacing();
		ExecutorService pool = Executors.newFixedThreadPool(4);
		
		for(Integer i : totalNumbers) {
			pool.execute(t1);
		}
	}

}
