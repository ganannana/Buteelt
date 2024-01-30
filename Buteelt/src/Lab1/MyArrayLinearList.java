package Lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;





public class MyArrayLinearList extends ArrayList {

	public MyArrayLinearList() {
		
	}
	
	public Object max() {
		Object m = new Object();
		m = this.get(0);
		
		for(int i = 1; i<this.size(); i++)
			if((int) m<(int) this.get(i)){
				m = this.get(i);
			}
		return m;
	}

	 void sort(int arr[]) {
		 int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < n-i; j++){  
	                          if(arr[j-1] > arr[j]){ 
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         } 
	                 }  
	         }  
	 }
	
	public Object min() {
		Object m = new Object();
		m = this.get(0);
		
		for(int i = 1; i<this.size(); i++)
			if((int) m>(int) this.get(i)){
				m = this.get(i);
			}
		return m;
	}
	public int sum() {
		int s = 0;
		for (int i = 0; i < this.size(); i++)
			s = s + (int) get(i);
		return s;
	}
	
	public double average() {
		return 1.0*sum()/size();
	}
	
	public static void main(String args[]) {
		MyArrayLinearList x = new MyArrayLinearList();
		x.add(0,4);
		x.add(1,3);
		x.add(2,2);
		x.add(3,1);
		int cmd, too, idx;
		
		int[] intArray = new int[x.size()];
		for(int i=0 ; i<x.size(); i++) {
			intArray[i] = (int) x.get(i);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add\n2.Remove\n3.Print\n-1.end");
		System.out.println("Command ?");
		cmd = sc.nextInt();
		
		
		while (cmd !=-1) {
			switch(cmd) {
			case 1: //add
				System.out.println("indx ?");
				idx = sc.nextInt();
				
				System.out.println("Num ?");
				too = sc.nextInt();
				
			x.add(idx, new Integer(too));
			break;
			
			case 2://remove
				System.out.println("indxREV ?");
				idx = sc.nextInt();
					x.remove(idx);
					break;
			case 3://print
				System.out.println("List ?" +x);
			}
			System.out.println("Command ?");
			cmd = sc.nextInt();
		
		}
		System.out.println("Max: " +(int) x.max());
		System.out.println("Min: " +(int) x.min());
		System.out.println("Sum: " +x.sum());
		System.out.println("Average: " +x.average());
		System.out.println("newList: " +x);
		int[] lastArray = new int[x.size()];
		for(int i=0 ; i<x.size(); i++) {
			lastArray[i] = (int) x.get(i);
		}
		x.sort(lastArray);
		System.out.println("sorted List: " +Arrays.toString(lastArray));
		
		sc.close();
	}

	
}
