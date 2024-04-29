/*
 גמאל מגאדלה
207513722
------------
אן גאנם
314627951

*/

import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of numbers ");
		int times  = input.nextInt();
		int[] array = new int[times];//טעות סוגריים לא במקום
		Number num;
		
		// Loop for reading times number into array
		for (int i = 0; i < times; i++) {
			System.out.println("\nEnter an integer ");
			array[i] = input.nextInt();
		}
		// Loop for creating Number objects and checking number of digits in all numbers
		for (int i = 0; i< times;i++) {//אין צורך לשווה בקטן מ - times
			num = new Number(array[i]);
			
			System.out.printf("\nThe number of digits of %d is %d ", num.getValue(),num.getNoOfDigits());
			System.out.println("press the place you want to know the number in");
			int DigitN=input.nextInt();
			System.out.printf("the diget in place %d is %d\n\n",DigitN,num.getDigit(DigitN));
		}
		input.close();	
	}
	
}
