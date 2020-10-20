package test;

import entity.entity;
import main.Identifying;
import org.junit.Test;
import service.Select;
import service.impl.SelectImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertSame;

public class Tast_Select {
	@Test
	public void Tast_Average() {
		List<entity> list = new ArrayList();
		list = Identifying.Identifying();
		Select a = new SelectImpl();
		entity e = new entity();
		e.setNum("1");
		entity e1 = a.Select(list, e);
		e.setNum("小明");
		e.setChinese(85);
		e.setEnglish(85);
		e.setMathematics(70);
		e.setTotal(240);
		assertSame(e1, e);

	}

}
