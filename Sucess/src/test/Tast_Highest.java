package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import entity.entity;
import main.Identifying;
import service.Average;
import service.Highest;
import service.impl.AverageImpl;
import service.impl.HighestImpl;

public class Tast_Highest {
	@Test
	public void Tast_Average() {
		List<entity> list = new ArrayList();
		list = Identifying.Identifying();
		Highest a = new HighestImpl();
		entity e = a.Highest(list);
		assertEquals(96, e.getEnglish());

	}

}
