package constructor;

 class Constructor {
	 //on arg constructor
		Constructor()
		{
			System.out.println("constructor without arguments");
		}
		//with parameterized constructor
		String name;
		Constructor(String s)
		{
			name=s;
			System.out.println("parameterized constructor:"+name);
		}
		//default constructor
		int a;
	 boolean b;

		  public static void main(String[] args) {
			  Constructor   obj3 = new Constructor();
    Constructor obj2=new Constructor("scott");
		    System.out.println("Default Value:");
		    System.out.println("a = " + obj3.a);
		    System.out.println("b = " + obj3.b);
		  }
		  
		}
		
		