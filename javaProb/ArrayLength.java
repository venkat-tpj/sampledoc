package javaProb;

import org.testng.annotations.Test;

public class ArrayLength {

	@Test
	public void Arrlength () {
//	public static void main(String[] args) {

		int[] number= {2,9,8,6,5,4,7};
		int numb[]= {9,5,8,6,4,1,2,3,5,6};

		System.out.println("Length of the value");

		int length1=number.length;
		int length2=numb.length;

		System.out.println(length1);
		System.out.println(length2);
	}	
}
