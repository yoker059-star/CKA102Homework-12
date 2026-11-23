package hw5;
//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
import java.util.Scanner;
public class Hw1120part1
{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Square s= new Square();
	        System.out.print("請輸入寬：");
	        s.setWidth(sc.nextInt());    
	        System.out.print("請輸入高：");
	        s.setHeight(sc.nextInt());
	        s.StarSquare();            
	    }
}
class Square
{
    private int width;   
    private int height;

    public void setWidth(int width) 
    {
        if (width > 0) 
        {
            this.width = width;
        } 
        else 
        {
            System.out.println("寬要>0");
        }
    }
    public void setHeight(int height) 
    {
        if (height > 0) 
        {
            this.height = height;
        } 
        else 
        {
            System.out.println("高要>0");
        }
    }

    public int getWidth()  
    { 
    	return width; 
    }
    public int getHeight() 
    { 
    	return height; 
    }
    public void StarSquare() 
    {
        for (int i = 0; i < getHeight(); i++) 
        {
            for (int j = 0; j < getWidth(); j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}