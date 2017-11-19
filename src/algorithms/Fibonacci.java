package algorithms;

import java.util.ArrayList;

public class Fibonacci {
	
	
	
	public static void main(String[] args) {
		ArrayList<Long> fibo = new ArrayList<Long>();
		fibo.add((long) 0);
		fibo.add((long) 1);
		findoNacci(fibo);	
	}
	static void findoNacci(ArrayList<Long> startingNums) {
		for (int i = 0; i < 100; i++) {
			long temp = (startingNums.get(startingNums.size()-1)) + (startingNums.get(startingNums.size()-2));
			System.out.println(temp);
			startingNums.add(temp);
		}
	
	}

}

