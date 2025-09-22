class ThrowsExep
{
    static void fun() throws illegalAcessException 
    {
        System.out.println("Inside fun().");
        throw new illegalAcessException("demo");
    }
    public static void main(String args[])
    {
        Try{
            fun();
        }
        catch(illegalAcessException e)
        {
            System.out.println("Caught in main");
        }
    }
}