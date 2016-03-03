package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/pconvert")
public class Perimeter {
	@GET
	@Produces("application/xml")
	public String vconversion(){
		 
		Double length= 1.0;
		Double perimeter;
				
		perimeter=(12 * length);
				
		String result="Output: Perimeter" + perimeter;
		return "<perimeter>" + "<length>" + length + "</length>" +  "<output>" + result + "</output>"+"</perimeter>";
		
	}
		@Path("{a}")
		@GET
		@Produces("application/xml")
		
		public String VConvert(@PathParam("a") Double a) {
			Double length= a;
			Double perimeter;
					
			perimeter=(12 * length);
			
			String result="Output: Perimeter" + perimeter;
			return "<perimeter>" + "<length>" + length + "</length>" +  "<output>" + result + "</output>"+"</perimeter>";
		}

}

