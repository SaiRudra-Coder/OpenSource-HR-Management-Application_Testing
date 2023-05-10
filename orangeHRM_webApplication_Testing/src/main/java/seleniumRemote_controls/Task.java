package seleniumRemote_controls;

import java.util.ArrayList;

public class Task 
{
	public static void main(String[] args) 
	{
		String text="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36";
		String[] res1=text.split("\\(");
		ArrayList al = new ArrayList();
		for(String div: res1)
		{
			String[] res2=div.split(" ");
			for(String div2: res2)
			{
				al.add(div2);
			}
		}
		ArrayList al2= new ArrayList();
		String[] val=al.get(10).toString().split("/");
		for(String sep: val)
		{
			String[] val2=sep.split("\\.");
			for(String sep2:val2)
			{
				al2.add(sep2);
			}
		}
		System.out.println(al.get(1)+" "+al.get(2)+" and "+al2.get(0)+" "+al2.get(1));
		
	}
}
