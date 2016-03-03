package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestVolume {

	VolumeChecker vc = new VolumeChecker();
	Double cm= vc.Volcheck(1.0);
	Double DefVol =  2.0;
	DecimalFormat f = new DecimalFormat("##.00");
	String tht = f.format(cm);
	Double pm = Double.parseDouble(tht);

	
	@Test
	public void testheight() {
		System.out.println("@Test volume(): "+DefVol + " = " + pm);
		assertEquals(DefVol, pm);
	}


}
