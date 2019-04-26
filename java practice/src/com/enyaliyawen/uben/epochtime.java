package com.enyaliyawen.uben;

import java.text.SimpleDateFormat;
import java.util.Date;

public class epochtime {

	public static void main(String args[]) {

	Date date =new Date(145);
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	System.out.println(format.format(date));
	
}

}
