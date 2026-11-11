package hw3;
import java.util.Scanner;
		public class Hw1110part3 {
			public static void main(String[] args) {
				int a=0;
				Scanner sc = new Scanner(System.in) ;
				System.out.println("輸入討厭的數字");
				if (sc.hasNextInt()) {
					a=sc.nextInt();
				}
				int count = 0;
				int[]x= new int[49];
				for (int i = 1; i <= 49; i++) {
					if(i % 10 ==a)
						continue;
					if (i >=10 && i / 10 ==a){
						continue;
					}
					System.out.print(i+" ");
					x[count]=i;
				count++;}
				System.out.println("\n=========================================");

				System.out.println(count+"個");
				int[] z=new int[6];
				int y,i;
				for (i=0 ;i < z.length; i++) {
				y = (int)(Math.random() * count);
					if (x[y]==0) {
						i--;
					}else {
						z[i]=x[y];
						x[y]=0;
						System.out.print(z[i]+" ");
				}
			}
		}
	}