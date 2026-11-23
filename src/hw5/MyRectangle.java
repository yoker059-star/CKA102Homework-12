package hw5;

public class MyRectangle 
{
	    private double width;   
	    private double depth;

	    void setWidth(double width) 
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
	    void setDepth(double depth) 
	    {
	        if (depth > 0) 
	        {
	            this.depth = depth;
	        } 
	        else 
	        {
	            System.out.println("高要>0");
	        }
	    }
	    double getArea()
	    {
	    	return this.width*this.depth;
	    }
	    public MyRectangle() 
	    {
	    	
	    }
	    public MyRectangle(double width, double depth) 
	    {
	    	setWidth(width);
	    	setDepth(depth);
	    }
}
