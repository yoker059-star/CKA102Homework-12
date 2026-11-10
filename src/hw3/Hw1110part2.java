package hw3;

import java.util.Scanner;

public class Hw1110part2 {
	public static void main(String[] args) {
		int i,a;
		Scanner sc = new Scanner(System.in) ;
		i = (int)(Math.random()*100);
		while(true) {
		System.out.println("請輸入:");
		if (sc.hasNextInt()) {
			a=sc.nextInt();
		if(a < i) {
			System.out.println("往更大猜");
		}else if(a > i) {
			System.out.println("往更小猜");
		}else if(a==i) {
			System.out.println("恭喜答對");
			break;
				}
			}	
		}
	}
}