package com.assignment;

import java.util.Scanner;

public class InAmsterdam {
   public int countAm(String str) {
	   
	   String target ="am";
	   int count=0;
	   String[] s1= str.split(" ");
	   for(int i=0;i<s1.length;i++) {
		   if(s1[i].equalsIgnoreCase(target)) {
			   count++;
			   
		   }
		   
	   }
	   System.out.println(count);
	  
	   return count;
   }
   public static void main(String[] args) {
	// Scanner sc= new Scanner(System.in);
	 //String str=sc.nextLine();
    InAmsterdam a=new InAmsterdam();
    a.countAm("I am Amsterdam am i");
   
    
}
}
