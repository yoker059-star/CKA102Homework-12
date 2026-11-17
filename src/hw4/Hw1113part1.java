package hw4;
public class Hw1113part1 
{
	//• 有個一維陣列如下：
	//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	//(提示：陣列，length屬性)
//	先求平均值，然後以平均值比較其他數值
	public static void main(String[] args) 
	{
		int[] x= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int i = 0; i < x.length; i++)
			sum += x[i];
		System.out.println("總合 = " + sum);
			double avg = (double)sum/ x.length;
//		System.out.println(x[i]>avg);
			System.out.println(avg);
		for (int i = 0; i < x.length; i++)
			if (x[i]>avg)
			{
				System.out.print(x[i]+" ");
			}
		//• 請建立一個字串，經過程式執行後，輸入結果是反過來的
		//例如String s = “Hello World”，執行結果即為dlroW olleH
		//(提示：String方法，陣列)
		System.out.println(" ");
		String a="Hello World";
		String b = new StringBuilder(a).reverse().toString();
		System.out.println(b);
		//• 有個字串陣列如下 (八大行星)：
		//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		//(提示：字元比對，String方法)
		String[] c={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		for (int i = 0; i < c.length; i++)
//		字串陣列有幾個字串
		{          
		    for (int j = 0; j < c[i].length(); j++) 
//		    字串陣列中的字串的長度
		    {  
		        char ch = c[i].charAt(j);
//		        如果有aeiou就+1
		        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		        {
		            count++;
		        }
		    }
		}
        System.out.println(count);
	}
}
