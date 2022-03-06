package modifiers_2;

import modifiers_2.TestE;
import modifiers.TestB;

public class TestE extends TestB{
	
	public static void main(String[] args) {
		new TestB().methodPublic();
		
		new TestE().methodPotected();
		new TestB().methodPublic();
}
}
