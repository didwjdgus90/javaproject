package Jeong;

public class Test6 {
	public static void main (String [] args)
	{
		Object obj = new Object()
				{
				 	public boolean equals(Object obj) 
				 	{
				 		return true;
				 	}
				}
		System.out.println(obj.equals("Hello"));
	}
}
