package com.sc.test;

import java.util.Arrays;

/**         
 * 算法  
 * @author：LuJianglin   
 * @time：      2017年7月19日       
 */
public class calculation {
	
	
	public static void main(String[] args) {
		int[] arr = {5,52,6,3,4};
		
		bubbleSort(arr);
		
	}
	
	/**
	 * 冒泡排序
	 * (和每个元素相比较，大的往后排，小的移到前面)
	 * @param arr
	 */
	public static void bubbleSort(int[] arr){
		for (int i = arr.length - 1; i>0;i--) {
			for (int j = 0; j < i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}
			for (int k = 0; k < arr.length; k++) {  
				   System.out.print(arr[k] + ", ");  
			} 
			System.out.println("|");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
