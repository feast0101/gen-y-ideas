package com.gph.footer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * File Name: TimeZoneUtil.java
 * @Description This class reflects various time zones across entire GPH application
 * @version 1.0
 * @since 26.02.2010
 * @author kallol
 */


public class TimeZoneUtil
{

String istTime = "";
String pstTime ="";
String edtTime = "";
String jstTime = "";
String gmtTime = "";
String cstTime = "";

public TimeZoneUtil() throws Exception
{

		Date currDate = new Date();
		DateFormat df = new SimpleDateFormat("HH:mm");
		df.setTimeZone(TimeZone.getTimeZone("PST"));
		pstTime = df.format(currDate);
	  	df.setTimeZone(TimeZone.getTimeZone("IST"));
		istTime = df.format(currDate);
		df.setTimeZone(TimeZone.getTimeZone("EST"));
		edtTime = df.format(currDate);
		df.setTimeZone(TimeZone.getTimeZone("JST"));
		jstTime = df.format(currDate);
		df.setTimeZone(TimeZone.getTimeZone("CST"));
		cstTime = df.format(currDate);
		df.setTimeZone(TimeZone.getTimeZone("GMT"));
		gmtTime = df.format(currDate);


}

	public String getISTTime()
	{

		return istTime;
	}

	public String getGMTTime()
	{
		return gmtTime;

	}

	public String getCSTTime()
	{
		return cstTime;
	}

	public String getPSTTime()
	{
		return pstTime;
	}

	public String getEDTTime()
	{
		return edtTime;
	}

	public String getJSTTime()
	{
		return jstTime;
	}
   /**
	 * Main Method to test the class
	 * @return IST time
	 */
public static void main(String args[]){
    try{
   TimeZoneUtil tzu=new TimeZoneUtil();
   System.out.println(tzu.getISTTime());
   }catch(Exception E){
    
  }
}
}