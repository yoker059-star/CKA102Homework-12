package hw2;

public class Hw1103part3 {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			char A = (char)('A'+ i);
			for(int j = 0; j <= i; j++) {
				System.out.print(A);
			}
			System.out.println();
		}
	}
}
