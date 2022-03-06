package modifiers;

public class TestA {

	private int y=10;
	long k=1000;
	public void methodpublic() {
	      methodPrivate();
	}
	protected void methodprotected()
	{
        methodPrivate();
	}
	void methodDefault(){
		methodPrivate();	
	}
	private void methodPrivate(){
		System.out.println("class testA:methodpivate");
		System.out.println("value of private value y"+y);
		System.out.println("value of long"+k);
	}
}

