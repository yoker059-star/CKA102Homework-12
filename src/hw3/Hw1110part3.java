package hw3;

public class Hw1110part3 {
	public static void main(String[] args) {
		int[] i= new int[6];
		for(int number=0; number< i.length; number++) {
			i[number]=(int)(Math.random()*49)+1;
		System.out.print(i[number]+" ");
		}
	}
}
