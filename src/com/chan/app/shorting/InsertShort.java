/**
 * 
 */
package com.chan.app.shorting;

import java.util.Arrays;

/**
 * @author chandra.sharma
 *
 */
public class InsertShort {

	/**
	 * 
	 */
	public InsertShort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//This is unsorted array
        Integer[] array = new Integer[] {12,13,24,10,3,6,90,70};
         
        //Let's sort using insertion sort
        insertionSort(array, 0, array.length);
         
        //Verify sorted array
        System.out.println(Arrays.toString(array));

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void insertionSort(Object[] a, int fromIndex, int toIndex) {
		 Object d;
	        for (int i = fromIndex + 1; i < toIndex; i++) 
	        {
	            d = a[i];
	            int j = i;
	            while (j > fromIndex && ((Comparable) a[j - 1]).compareTo(d) > 0) 
	            {
	                a[j] = a[j - 1];
	                j--;
	            }
	            a[j] = d;
	        }
	    }

}
