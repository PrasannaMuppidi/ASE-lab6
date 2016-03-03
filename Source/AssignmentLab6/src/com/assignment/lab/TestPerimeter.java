package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestPerimeter {

	PerimeterChecker pc = new PerimeterChecker();
	Double cm= pc.Pericheck(1.0);
	Double DefPer =  11.00;
	DecimalFormat f = new DecimalFormat("##.00");
	String tht = f.format(cm);
	Double pm = Double.parseDouble(tht);

	
	@Test
	public void testheight() {
		System.out.println("@Test perimeter(): "+DefPer + " = " + pm);
		assertEquals(DefPer, pm);
	}


}
