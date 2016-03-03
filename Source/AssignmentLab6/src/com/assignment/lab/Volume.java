package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/vconvert")
public class Volume {
	@GET
	@Produces("application/xml")
	public String vconversion(){
		 
		Double length= 1.0;
		Double volume;
				
		volume=(length * length * length);
				
		String result="Output: Volume" + volume;
		return "<volumeoutput>" + "<length>" + length + "</length>" +  "<output>" + result + "</output>"+"</volumeoutput>";
		
	}
		@Path("{l}")
		@GET
		@Produces("application/xml")
		
		public String VConvert(@PathParam("l") Double l) {
			Double length= l;
			Double volume;
					
			volume=(length * length * length);
					
			String result="Output: " + volume;
			return "<volumeoutput>" + "<length>" + length + "</length>" +  "<output>" + result + "</output>"+"</volumeoutput>";		
		}

}

