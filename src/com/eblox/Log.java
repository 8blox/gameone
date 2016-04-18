package com.eblox;

/**
 * Created by phili on 2016-03-28.
 */
 
public class Log
{
	private string URL;
	private File file;
	
	public static void log(string URL)
	{
		this.URL = URL;
		//create file
	}
	
	public error(String e)
	{
		write("ERROR: " + e);
	}
	
	public write(String e
	{
		file.append("[" + System.getTime() + "] " + e  + "\n");	
	}


}
