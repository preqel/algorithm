package com.example.selectsort;

public class Main {

	public static void main(String[] args) {
		int[] a =   {32,8,23,87,51,44,9};
		
		slectsort(a);
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}

	
	//Ñ¡ÔñÅÅÐò
//	public static  void slectsort(int[] array ){
//		
//		for(int j=0;j<array.length;j++){
//			
//		    
//			for(int i= j+1;i<array.length;i++){
//				
//				if(array[i]<array[j]){
//					
//					int temp = array[j];
//					array[j] = array[i];
//					array[i] = temp;
//				}
//				
//			}
//			
//		}
//		
//	}
	
	public static  void slectsort(int[] array ){
		for(int i=0;i<array.length-1;i++){
			int mindex = i;
			for(int j = i+1 ;j<array.length;j++){
				if (array[j] < array[mindex]) {
                   mindex = j;
				}
			}
			
			if(mindex!= i){
				int temp = array[i];
				array[i] = array[mindex];
				array[mindex] = temp;
			}
		}
	
	}
	
}
