package hw4;

import java.util.Scanner;

public class Hw1113part3 
{
//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
	public static void main(String[] args)
	{
		int[] a=new int[3];
//		int[] m= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner sc = new Scanner(System.in) ;
		System.out.println("請輸入:");
		for (int i=0 ;i < a.length; i++)
		{
			if(sc.hasNextInt()) 
			{
			a[i]=sc.nextInt();
			}
		}
		int day;
		if((a[1]==2 && a[2]>29) || a[1]>12 || a[1]<0 || a[2]<0 ||a[2]>31) 
		{
			System.out.println("error");
		}
		else
		{
			if(a[0]%400==0 ||(a[0]%4==0 && a[0]%100 !=0))
			{
				day=(275* a[1])/9-1* ((a[1]+ 9)/12) + a[2] -30;
				System.out.println("西元"+a[0]+"年"+a[1]+"月"+a[2]+"日");
				System.out.println("第"+day+"天");
			}
			else
			{
				day=(275* a[1])/9-2*((a[1]+ 9)/12) + a[2]-30;
				System.out.println("西元"+a[0]+"年"+a[1]+"月"+a[2]+"日");
				System.out.println("第"+day+"天");
			}
		}
	}	
}
	

