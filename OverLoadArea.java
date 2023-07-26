import java.util.Scanner;
class Overload

    {

        void area(float x)

        {

            System.out.println("the area of the square is "+(x*x)+" sq units");

        }

        void area(float x, float y)

        {

            System.out.println("the area of the rectangle is "+x*y+" sq units");

        }

        void area(double x)

        {

            double z = 3.14 * x * x;

            System.out.println("the area of the circle is "+z+" sq units");

        }

    }

    class OverLoadArea 

    {

         public static void main(String args[]) 

    	{

    	   Overload ob = new Overload();
Scanner sc=new Scanner(System.in);
System.out.println("enter the side");
float a=sc.nextFloat();

    	   ob.area(a);
System.out.println("enter the length and breadth");
float l=sc.nextFloat();
float b=sc.nextFloat();

	ob.area(l,b);
System.out.println("enter the radius");
double r=sc.nextFloat();
    	   ob.area(r);

            }

    }
