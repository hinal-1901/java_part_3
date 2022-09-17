package part3.pr6; 
import java.util.*; 
public class importing { 
 int number; 
 public void set() { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter any number : "); 
 number = sc.nextInt(); 
 sc.close(); 
 } 
 public void get() { 
 if (number > 0) { 
 if (number % 2 == 0) { 
 System.out.println(+number + " is even 
number"); 
 } else { 
 System.out.println(+number + " is odd 
number"); 
 } 
 } 
 else
 { 
 System.out.println("Enter the non-zero 
number"); 
 } 
 } 
} 
Main class file // Name : Sanghvi HInal
// ID : 21CE119
// Write a program that demonstrates use of packages & 
import statements.
package part3.pr6; 
import part3.pr6.importing; 
public class practical6 { 
 public static void main(String[] args) { 
 importing obj = new importing(); 
 obj.set(); 
 obj.get(); 
 System.out.println(" THIS PROGRAM IS PREPARED BY 
21CE119_Hinal "); 
 } 
} 