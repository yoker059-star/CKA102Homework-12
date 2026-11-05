package hw2;

public class Hw1103part1 {
	public static void main(String[] args) {
		int sum1=0;
		for(int count=0; count <=1000; count=count+2)
			sum1 += count;
			System.out.println(sum1);

		int sum2=0, count=0;
		do {
			sum2 +=count;
			count=count+2;
		}while(count<=1000);
		System.out.println(sum2);

		int sum3=0, count2=0;
		while(count2<=1000) {
			sum3 += count2;
			count2=count2+2;
		}
		System.out.println(sum3);
		

		int i;
			for(i=1 ; i<=10; i++) {
			System.out.print(i*i+" ");
			}		
	}
}
	
	