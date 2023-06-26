package day1;
abstract class Shape
{
	double area;
	abstract void calculateArea();
	
}
class circle extends Shape
{
	int r;
	circle(int r)
	{
		this.r=r;
	}
	void calculateArea()
	{
		area =  3.14*r*r;
		System.out.println("area of circle : "+area);
	}
}

class rectangle extends Shape
{
	int l,b;
	public rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void calculateArea()
	{
		area =  l*b;
		System.out.println("area of rectangle : "+area);
	}
}

public class CalArea {
	public static void main(String[] args)
	{
		circle c = new circle(4);
		c.calculateArea();
		
		rectangle r = new rectangle(5,6);
		r.calculateArea();
	}
}
