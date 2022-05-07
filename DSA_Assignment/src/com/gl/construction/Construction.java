package com.gl.construction;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Construction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building\r\n");
		size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 1; i <= size; i++) {
			System.out.println("enter the floor size given on day :" + i);
			arr[i - 1] = sc.nextInt();
		}

		int arr1[] = new int[arr.length];
		arr1 = arr.clone();

		Arrays.sort(arr1);
		System.out.println("The order of construction is as follows");
		int count = 0, r = 1;
		for (int i = 1; i <= size; i++) {
			System.out.println("\nDay: " + i);

			if (arr1[size - r] == arr[i - 1]) {
				System.out.print(arr1[size - r]);
				if (count > 0) {

					for (int j = 1; j <= count; j++) {
						System.out.print(" " + arr1[size - r - j]);
					}
					r = r + count + 1;
					count = 0;
				} else
					r = r + count + 1;

			} else {
				System.out.println("\n");
				count++;
			}

		}

	}

}
