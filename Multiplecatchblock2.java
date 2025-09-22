Class Multiplecatchblock2
{
Public static void main(string[] args)
{
Try {
Int a[]=new int [5];
System.out.println(a[10]);
}
Catch (Arithmeticexception e)
{
System.out.println(“Arthmetic Expression occurs “);
}
}
}
Catch (Arrayindexoutofboundsexceptiion e)
{
System.out.println(“Arrayindexoutofbounds Exception occurs”);
}
catch(Exception e)
{
System.out.println(“parent Exception occurs”);
}
System.out.println(“rest of the code”);
}
}