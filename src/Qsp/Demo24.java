package Qsp;

import java.util.ArrayList;
import java.util.List;

public class Demo24 
{
	public static void main(String[] args) 
	{
		List<String> al = new ArrayList<>();
		//add the data from list
		al.add("a");
		al.add("a");
		al.add("c");
		al.add("b");
		
		//count the size of list
		int count = al.size();
		System.out.println(count);
		
		for (String a : al) 
		{
			System.out.println(a);
		}
		
		//to print data from the list
		/*for (int i = 0; i < count; i++) 
		{
			String text = al.get(i);
			System.out.println(text);
		}
		for(ref type,ref name,condition)*/
		
		
	}

}
