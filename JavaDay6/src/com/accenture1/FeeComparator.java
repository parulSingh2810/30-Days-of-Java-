package com.accenture1;

import java.util.Comparator;

public class FeeComparator  implements Comparator<Course>  {

	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		if(o1.getCourseFee() > o1.getCourseFee()) {
			return 1;
		}
		else if (o1.getCourseFee()<o2.getCourseFee()){
			return -1;
		}
		else {
			return 0;
		}
		
	}

}
