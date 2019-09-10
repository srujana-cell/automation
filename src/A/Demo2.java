package A;

import java.util.ArrayList;
import java.util.List;

public class Demo2 
{
	List<String> al = new ArrayList<String>();
	//add the data from list
	al.add("a");
	al.add("c");
	al.add("a");
	al.add("b");
	al.add("a");
	ArrayList<String> copyal = new ArrayList<String>(al);
	collections.sort(al);
	if(al.equals(copyal))
	{
		System.out.println("sorted");
	}
	else
	{
		System.out.println("not-sorted");
	}
	

}
