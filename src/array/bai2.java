package array;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Array statement
		int array[] = new int[100];
		
		while ( true ) {
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
			
			//Input Item insert
			int item;
			System.out.println("Nhap phan tu can chen");
			item = input.nextInt();
			
			//Insert last
			//array[amount] = item;
			
			//Insert First
			/*amount = amount + 1;
			for ( int order = amount - 1 ; order >= 1 ; order-- ) {
				array[order] = array[order - 1];
			}
			array[0] = item;*/
			
			//Insert place = k
			
			int place;
			System.out.println("Nhap vi tri can chen");
			place = input.nextInt();
			
			amount = amount + 1;
			for ( int order = amount - 1 ; order > place ; order-- ) {
				array[order] = array[order - 1];
			}
			array[place] = item;
			
			//Print array
			System.out.println("Mang da nhap la");
			for ( int order = 0 ; order <= amount - 1 ; order++ ) {
				System.out.print(array[order] + " ");
			}
			System.out.println("");
		}
	}

}
