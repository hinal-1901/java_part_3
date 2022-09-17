package part3.pr5; 
class tempClass_package { 
 public void show() 
 { 
 System.out.println("This is a Package..."); 
 } 
 // public static void main(String[] args) {
 // tempClass_package p = new tempClass_package();
 // p.show();
 // }
} 
Main class file // Name : Sanghvi Hinal
// ID : 21CE119
// Write a java program which shows importing of classes 
from other user 
// define packages. 
package part3.pr5; 
import part3.pr5.tempClass_package; 
public class practical5 { 
 public static void main(String[] args) { 
 part3.pr5.tempClass_package P = new
part3.pr5.tempClass_package(); 
 P.show(); 
 System.out.println(" THIS PROGRAM IS PREPARED BY 
21CE119_Hinal "); 
 } 
} 