package modifiers;

public class TestB {

	public static void main(String ags[])
	{
		TestA ob=new TestA();
		ob.methodpublic();
		ob.methodprotected();
		ob.methodDefault();
		System.out.println("value of long"+new TestA().k);
	}
	public void methodPublic() {
		System.out.println("class TestB:methodPublic");
	}
	protected void methodPotected()
	{
		System.out.println("class testB:methodprotected");
	}
	void methodDefault() {
		System.out.println("class testB:methodDefault");
	}
	private void methodprivate() {
		System.out.println("class TestB:methodprivate");
	}		
	}

