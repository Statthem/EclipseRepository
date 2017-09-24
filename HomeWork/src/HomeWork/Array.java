package HomeWork;

import java.util.ArrayList;

public class Array {

	
	static int size = 80000000;
	static Integer[] arr;
	ArrayList<Double> list = new ArrayList<>();

	public static double task2() throws InterruptedException{
		Array ob = new Array();

		arr = new Integer[size];

		for(int i = 0;i<=arr.length;i++){
			arr[i] = i;
		}
		ob.Threads();
		return 6;
		
	}

	int r = Runtime.getRuntime().availableProcessors();
	int bordersOfThread;
	int numberPerThread = size/r;


	public void Threads() throws InterruptedException{
		int r = Runtime.getRuntime().availableProcessors();
		bordersOfThread = 0;
		numberPerThread = size/r;
		Array ob = new Array();

		for(int j = 1;j<=r;ob.inrJ(j)){		
			Thread thread = new Thread(()->{

				Thread.currentThread().setName(Integer.toString(j));
				double result = 0;
				int tmp = bordersOfThread;
				for(int i = tmp;i<tmp + numberPerThread;i++){
					result = result + (Math.sin(i) + Math.cos(i));		
				}
				list.add(result);
			});
			thread.start();
			ob.inr();

		}


	}
	public void inr(){
		bordersOfThread = bordersOfThread + numberPerThread;
	}
	public void inrJ(int j){
		j = j + 1;
	}

}
