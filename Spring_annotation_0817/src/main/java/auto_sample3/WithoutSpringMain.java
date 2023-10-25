package auto_sample3;

public class WithoutSpringMain {

	public static void main(String[] args) {
		TestB b = new TestB();
		TestC c = new TestC();
		TestA a = new TestA();
		
		a.setB(b);
		a.setC(c);
		a.show();

	}

}
