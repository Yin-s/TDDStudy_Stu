package Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Main.Calculate;
import Main.Rectangle;

class Test_Calculate {

	@Test
	void test() {
		
		Calculate cal=new Calculate();
		cal.setRectangle(new Rectangle());
		int ret=cal.getResult(2, 3, "girth");
		assertEquals(10,ret);
	}

}
