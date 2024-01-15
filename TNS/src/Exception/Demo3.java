package Exception;

public class Demo3 {

       public static void main(String[] args)
       {
    	   try {
    		   int a,b,c=0;
    		   a=Integer.parseInt(args[0]);
    		   b=Integer.parseInt(args[1]);
    		   c=a/b;
    		   System.out.println("Div="+c);
    		   
    	   }catch(ArithmeticException e)
    	   { 
    		   System.out.println("Denominator should not be zero");
    		   
    	   }
    	   catch(ArrayIndexOutOfBoundsException e)
    	   {
    		   System.out.println("Enter atleast two parameters");
    		   
    	   }
    	   catch(NumberFormatException e)
    	   {
    		   System.out.println("Enter only number data ");
    	   }
    	   catch(Exception e)
    	   {
//    		   System.out.println(e);//tostring method
//    		   System.out.println(e.getMessage());//getmethod
//    		   e.getStackTrace();
//    		   
    		   System.out.println("Exception Occured!!!!");
    	   }
       }


}
