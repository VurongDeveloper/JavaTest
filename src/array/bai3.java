package array;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int array[] = new int[100];
		
		while( true ) {
			
			//Input amount
			int amount, test;
			do {
				test = 1;
				System.out.println("Nhap so luong phan tu cua mang");
				amount = input.nextInt();
				if ( amount < 1 ) test = 0;
			} while ( test == 0 );
			
			//Input array
			for ( int order = 0 ; order <= amount - 1 ; order++ ) {
				System.out.println("Nhap phan tu thu " + order);
				array[order] = input.nextInt();
			}
			
			//Sort item even - increase (tang)
			/*for ( int order = 0 ; order <= amount - 1 ; order++ ) {
				for ( int sub = order + 1 ; sub <= amount - 1 ; sub++ ) {
					if ( array[order] % 2 == 0 && array[sub] % 2 == 0 && array[order] > array[sub] ) {
						int temp = array[order];
							array[order] = array[sub];
							array[sub] = temp;
					}
				}
			}*/
			
			//Sort place odd down - sap xep vi tri le giam dan 
			for ( int order = 0 ; order <= amount - 1 ; order ++ ) {
				for ( int sub = order + 1 ; sub <= amount - 1 ; sub ++ ) {
					if ( order % 2 == 1 && sub % 2 == 1 && array[order] < array[sub] ) {
						int temp = array[sub];
							array[sub] = array[order];
							array[order] = temp;
					}
				}
			}
			
			//Output array
			System.out.println("Mang da nhap la");
			for ( int order = 0 ; order <= amount - 1 ; order ++ ) {
				System.out.print(array[order] + " ");
			}
			System.out.println();
		}
	}

}
