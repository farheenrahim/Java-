
package javaapplication14;

import java.io.*;
public class JavaApplication14 {

public static void main(String[] args) throws IOException {
BufferedReader bufferedreader= new BufferedReader( new InputStreamReader(System.in));
System.out.println("Please enter the first Number");
int num1=Integer.parseInt(bufferedreader.readLine());
System.out.println("Please enter the second number");
int num2=Integer.parseInt(bufferedreader.readLine());
System.out.println("The addition of two numbers is "+(num1+num2));
System.out.println("The addition of two numbers is "+(num1-num2));
System.out.println("The addition of two numbers is "+(num1*num2));


}}
    
    

