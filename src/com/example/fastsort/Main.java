package com.example.fastsort;
//¿ìËÙÅÅĞò
public class Main {

	public static void main(String[] args) {
		int[] a =   {32,8,23,87,51,44,9};
		fastsort(a,0,a.length);
		for(int i=0;i<a.length;i++){
			System.out.print(i);
		}
		System.out.println("heelo");
	}

	
	
	
	private static void fastsort(int[] a,int low,int hign) {
		int middle = findmiddle(a,low,hign-1);
		fastsort(a, middle , hign-1);
		fastsort(a, 0, middle);
	}


	private static int findmiddle(int[] a, int low, int hign) {
		
		int temp = a[low];
		
		while(low < hign){
			
			while(a[low]<=temp && hign>low){
			
				low++;
			}
		   a[hign] = a[low];
		   
		   while(a[hign] >= temp && hign>low){
			   hign --;
		   }
			a[low] = a[hign];
 
		}
		a[hign] = temp;
		return low;
	}
	

}
