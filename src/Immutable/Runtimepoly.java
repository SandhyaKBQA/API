package Immutable;

    class Shape {

	    void draw()
	   {
	      System.out.println("try");

	   }
    }
     class Circle extends Shape{
       void draw()
     {
      System.out.println("circle");

       }

     }
   class Try extends Shape{
     void draw()
   {
     System.out.println("try1");

       }

     }
    class Cir
    {
      static void mycir(Shape d)
      {
	    d.draw();
       }
    }
public class Runtimepoly
   {
    public static void main(String args[])
   {
	Cir.mycir(new Try());
	Cir.mycir(new Circle());
	
      }

    }
