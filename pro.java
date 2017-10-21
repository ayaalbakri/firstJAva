public class pro {

   public static void main(String args[]) {
     System.out.println( printMsg("Thank you for teaching me Java") );
     System.out.printIn(guessMyNumber(3));
   }
   public static String printMsg (String s1){
   return s1;
   }
   public void guessMyNumber(int inp){
       int x = 3;
       if(inp == x){
           return "con";
       }
       else{
           return "try again";
       }
   }

}