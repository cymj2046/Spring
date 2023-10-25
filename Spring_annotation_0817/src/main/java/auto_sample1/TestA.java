package auto_sample1;

import org.springframework.beans.factory.annotation.Autowired;

public class TestA {
	@Autowired
	private TestB b;
	@Autowired
	private TestC c;
	
	//주입 공간 ==> setter
//	@Autowired
//	public void setB(TestB b) {
//		this.b = b;
//	}
//	@Autowired
//	public void setC(TestC c) {
//		this.c = c;
//	}
//	
	
	//추가메서드
	public void show() {
		b.display();
		c.display();
	}

}
