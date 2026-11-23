package hw5;
//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public class Hw1120part2 
	{
		public static void randAvg() 
		{
			int sum=0;
			int[]x= new int[101];
			int[] z=new int[10];
			int y,i;
			for (i=0 ;i<x.length; i++)
			{
				x[i]=i;
			}
			for (i=0 ;i < z.length; i++) 
			{
			y = (int)(Math.random() * x.length);
				if (x[y]==-1) 
				{
					i--;
				}
				else 
				{
					z[i]=x[y];
					sum +=z[i];
					x[y]=-1;
					System.out.print(z[i]+" ");
				}
			}
			System.out.println();
			System.out.println("本次亂數結果: "+sum/10.0);
		}

		public static void main(String[] args) 
		{
			randAvg();
		}
	}

