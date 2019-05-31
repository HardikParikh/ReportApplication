package com.pmac.dashboard;

import com.pmac.dashboard.util.Operations;

public class DashboardData {

	public static void main(String[] args){
		System.out.println("Minimum weather difference: "+Operations.findMinimum("src/com/pmac/dashboard/data/w_data.txt",1,2,0));
		System.out.println("Minimum goal difference:"+Operations.findMinimum("src/com/pmac/dashboard/data/soccer.txt",6,8,1));	
	}
}
