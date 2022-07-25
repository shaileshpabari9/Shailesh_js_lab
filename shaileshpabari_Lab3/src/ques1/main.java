package ques1;

public class main {
	
public static void  main (String[] args){
			 
	 BalancedBrackets bb = new BalancedBrackets();
	 
	 var inputString =bb.expr();
	  
     // Function call
     if (bb.areBracketsBalanced(inputString)==true) {
         System.out.println("Balanced ");}
     else {
         System.out.println("Not Balanced ");}
}
}
