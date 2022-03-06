package methods;

public class Methodsandreturn {
	


		public int multipynumbers(int a,int b) {
			int z=a*b;
			return z;
		}
		public int addingnumbers(int x,int y) {
			int n=x+y;
			return n;
		}
		//call by value
		int val=150;

		int operation(int val) {
			val =val*10/100;
			return(val);
		}
		//method overloading
		public void area(int b,int h)
	    {
	         System.out.println("Area of Triangle : "+(0.5*b*h));
	    }
	    public void area(int r) 
	    {
	         System.out.println("Area of Circle : "+(3.14*r*r));
	    }



		public static void main(String[] args) {

			Methodsandreturn b=new Methodsandreturn();
			int ans= b.multipynumbers(10,3);
			int ans1=b.addingnumbers(20, 30);
			System.out.println("Multipilcation is :"+ans);
			System.out.println("addition is:"+ans1);
			System.out.println("Before operation value of data is "+b.val);
			b.operation(100);
			System.out.println("After operation value of data is "+b.val);
              b.area(5,6);
              b.area(9);
			}
}
