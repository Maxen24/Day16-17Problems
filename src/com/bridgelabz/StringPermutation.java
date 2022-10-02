/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class StringPermutation {


	/**
	 * @param args
	 */
	
	static void fun(char[] a , int k, int n) {
		if (k==n) {
			for (int i=0; i<n; i++) 
				System.out.print(a[i]);
				System.out.println();
			}
			
		else 
				for (int i=k; i<n; i++) {
					char t=a[i];
					a[i]=a[k];
					a[k]=t;
				fun(a,k+1,n);
				char s=a[i];
				a[i]=a[k];
				a[k]=s;
				}
			}
	public static void main(String[] args) {
		String str = "ABC";
		char []arr=str.toCharArray();
		
		fun(arr,0,arr.length);
		

	}

}
