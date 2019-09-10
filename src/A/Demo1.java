package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 
{
	public static void main(String[] args) 
	{
			List<String> al = new ArrayList<String>();
			//add the data from list
			al.add("a");
			al.add("c");
			al.add("a");
			al.add("b");
			al.add("a");
			//to sort the list
			Collections.sort(al);
			//to print
			for (String a : al) 
			{
				System.out.println(al);
				break;
			}
	}

	

}
