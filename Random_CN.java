package Tuan4;

import java.util.Random;
import java.util.Scanner;

public class RandomInt {
	private static Scanner sc;
	//private static int ran;
	
	
	public static int rand(int min, int max)
	{
		Random rd = new Random();
		//int range = ;
		int randomNUM = min + rd.nextInt(max - min +1);
		return randomNUM;
	}
	
	public static void play( )
	{
		
		sc = new Scanner(System.in);
		int i=0;
		int chuan = rand(1,100);
		System.out.printf("chuan %d: \n", chuan-1);
		while(i<10)
		{
			
			System.out.printf("Nhap so ban doan lan %d: ", i+1);
			
			int num = sc.nextInt();
			if((num - chuan)==0)
			{
				System.out.println("Dung r"); break;
			}else if((num - chuan)>0){
				System.out.println("So ban nhap lon hon");
			}else {
				System.out.println("So ban nhap nho hon");
			}
			i++;
		}
		System.out.println("The end!");	
	}
     
	public static void main(String[] args) {
		play();
	}

}
