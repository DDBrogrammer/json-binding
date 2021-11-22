package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
	// create object mapper
    	 ObjectMapper mapper=new ObjectMapper();
    	 Student student=
    			 mapper.readValue(new File("data/sample-full.json"), Student.class);
    	 
    	 System.out.println(student.toString());
    	 System.out.println(student.getAddress().toString());
    	 
    	 for(String l:student.getLanguages()) {
    		 System.out.println(l);
    	 }
    	 
      }catch (Exception e) {
	     e.printStackTrace();
      }
		
		
		
		
		
		
		
		
		
	}

}
