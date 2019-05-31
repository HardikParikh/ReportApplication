package com.pmac.dashboard;

import com.pmac.dashboard.util.Operations;

/*
 * Main class 
 * 
 */

public class DashboardData {

	public static void main(String[] args){
		
		//Check for runtime arguments. If provided than process that information else calculates and displays for weather and goal both
		try{
			if(args.length > 0 && args.length == 4){
				System.out.println("Minimum weather difference: "+Operations.findMinimum(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3])));			
			}
			else{	
				System.out.println("Minimum weather difference: "+Operations.findMinimum("src/com/pmac/dashboard/data/w_data.txt",1,2,0));
				System.out.println("Minimum goal difference: "+Operations.findMinimum("src/com/pmac/dashboard/data/soccer.txt",6,8,1));	
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}