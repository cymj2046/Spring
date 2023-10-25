package auto_sample3;

import org.springframework.beans.factory.annotation.Autowired;

public class TestA {
	private TestB b;
	private TestC c;
	
	//주입 공간 ==> setter
	public void setB(TestB b) {
		this.b = b;
	}
	public void setC(TestC c) {
		this.c = c;
	}
	
	
	//추가메서드
	public void show() {
		b.display();
		c.display();
	}

}
