package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw1110part1 {
		public static void main(String[] args) {
			double[] a= new double[3];
			Scanner sc = new Scanner(System.in) ;
			System.out.println("請輸入:");
			for (int i=0 ;i < a.length; i++) {
			if(sc.hasNextDouble()) {
				a[i]=sc.nextDouble();
			}
			
			System.out.println(a[i]+" ");
			}
			System.out.println("======================");
				Arrays.sort(a);
				if (a[0]+a[1]>a[2]){
					System.out.println("這是一個普通的三角形");
						if (a[0]*a[0]+a[1]*a[1] == a[2]*a[2]){
							System.out.println("而且是直角三角形!");
								}
							}
						else {
					System.out.println("這不是一個三角形");
							}
//				int i = 0;
//				double b = 0;
//				Scanner sc = new Scanner(System.in) ;
//				System.out.println("請輸入:");
//				if(sc.hasNextInt()) {
//					i= sc.nextInt();
//				}
//				if(sc.hasNextDouble()) {
//					b= sc.nextDouble();
//				}
//				  System.out.println("--- 讀取成功 ---");
//			      System.out.println("整數 i 的結果是: " + i);
//			      System.out.println("浮點數 b 的結果是: " + b);
//			        
//			        sc.close();
			}
		}

