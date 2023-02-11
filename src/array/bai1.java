package array;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Array statement
		int array[] = new int[100];
		
		while ( true ) {
			//Input amount (- so luong phan tu) array
			int amount, test;
			
			do {
				test = 1;
				System.out.println("Nhap so luong phan tu cua mang");
				amount = input.nextInt();
				if( amount < 1) test = 0;
			} while ( test == 0 );
			
			for ( int order = 0 ; order <= amount - 1 ; order ++ ) {
				System.out.println("Nhap phan tu thu " + order);
				array[order] = input.nextInt();
			}
			
			//Sort augment - sap xep tang
			/*for ( int order = 0 ; order <= amount - 1 ; order++ ) {
				for ( int sub = order + 1 ; sub <= amount - 1 ; sub ++ ) {
					if ( array[order] > array[sub] ) {
						int temp = array[order];
							array[order] = array[sub];
							array[sub] = temp;
					}
				}
			}*/
			
			//sort down - sap xep giam
			
			for ( int order = 0 ; order <= amount - 1 ; order++ ) {
				for ( int sub = order + 1 ; sub <= amount - 1 ; sub++ ) {
					if ( array[order] < array[sub] ) {
						int temp = array[sub];
							array[sub] = array[order];
							array[order] = temp;
					}
				}
			}
			
			//Code print 
			System.out.println("Mang sau khi sap xep la");
			for ( int order = 0 ; order <= amount - 1 ; order ++ ) {
				System.out.print(array[order] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}