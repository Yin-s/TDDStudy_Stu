package test;

import entity.entity;
import main.Identifying;
import org.junit.Test;
import service.Average;
import service.impl.AverageImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tast_Average {
	@Test
	public void Tast_Average() {
		List<entity> list = new ArrayList();
		list = Identifying.Identifying();
		Average a = new AverageImpl();
		entity e = a.Average(list);
		assertEquals(85, e.getEnglish());

	}

}
