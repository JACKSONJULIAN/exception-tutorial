package Exception;

public class MyExplicitThrow
{
public static void main(String[] args) 
{
try
{
	 MyExplicitThrow met =new MyExplicitThrow();
	 System.out.println("length of JUNK is " + met.getStringSize("JUNK"));
	 System.out.println("length of WRONG is"+met.getStringSize("WRONG"));
	 System.out.println("length of null string is "+ met.getStringSize(null));
}
	 catch(Exception ex)
	 {
		 System.out.println("exception message"+ex.getMessage());
	 }
}

public int getStringSize(String str) throws Exception
{
	if(str==null)
	{
		throw new Exception("Null is passed");
	}
	return str.length();
}
}