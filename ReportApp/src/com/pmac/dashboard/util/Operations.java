package com.pmac.dashboard.util;

import java.io.File;
import java.util.Scanner;

import com.pmac.dashboard.util.Util;

public final class Operations {
		
	static String SPLIT_TEXT = "\\s+";
	
	public static String findMinimum(String path,int index1, int index2, int index3){
		String line="";
		String retCountry="";
		
		double retDiffer = Double.POSITIVE_INFINITY;

		try (Scanner s = new Scanner(new File(path))) {
		    s.nextLine(); // Excluding the header
            while (s.hasNextLine() &&(line = s.nextLine()) != null) {
            	try{
	                String[] country = line.trim().split(SPLIT_TEXT);
	                
	                Util calcDiff = (int F, int A) -> Math.abs(F - A);
	                int diff = calcDiff.findDifference(Integer.parseInt(country[index1]),Integer.parseInt(country[index2]));
	                
	                if(diff <  retDiffer){
	                	retCountry = country[index3];
	                	retDiffer = diff;
	                }
            	}
            	catch(ArrayIndexOutOfBoundsException ae){	            		
            	}
            	catch(Exception e){	            		
            	}
            }  
		}catch(Exception e){			
		}
		
		return retCountry+" - "+retDiffer;
	}
}