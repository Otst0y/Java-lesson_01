package Lesson_01;

import java.util.Random;

public class Application {
	public static void main(String[] args) {

		/*
		byte b = 112;
		short s = 2485;
		int i = 48736;
		long l = 789L;
		float f = 15.26F;
		double d = 21.99;
		final char Character = 'a';
		final boolean BooleanValue = true;

		System.out.println("Byte minimum value is " + Byte.MIN_VALUE);
		System.out.println("Byte maximum value is " + Byte.MAX_VALUE);
		System.out.println();
		
		System.out.println("Short minimum value is " + Short.MIN_VALUE);
		System.out.println("Short maximum value is " + Short.MAX_VALUE);
		System.out.println();
		
		System.out.println("Integer minimum value is " + Integer.MIN_VALUE);
		System.out.println("Integer maximum value is " + Integer.MAX_VALUE);
		System.out.println();
		
		System.out.println("Long minimum value is " + Long.MIN_VALUE);
		System.out.println("Long maximum value is " + Long.MAX_VALUE);
		System.out.println();
		
		System.out.println("Float minimum value is " + Float.MIN_VALUE);
		System.out.println("Float maximum value is " + Float.MAX_VALUE);
		System.out.println();
		
		System.out.println("Double minimum value is " + Double.MIN_VALUE);
		System.out.println("Double maximum value is " + Double.MAX_VALUE);
		System.out.println();
		
		System.out.println("Char constant value = " + Character);
		System.out.println("Boolean constant value = " + BooleanValue);
		*/
		
		int[] array = new int[10];
		Random rnd = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(101);
			System.out.print(array[i] + " ");
		}
		
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println();
		System.out.println("Minimum value is " + min);
		
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println();
		System.out.println("Maximum value is " + max);
		
		
		

	}

}
