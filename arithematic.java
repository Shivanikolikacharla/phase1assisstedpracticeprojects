package Arithmeticcalculator;
import java.util.Scanner;

public class arithematic 
{
public static void main(String args[])
{
	 int operator;
	 Double number1, number2, result;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Choose an operator: +, -, *, /");
	 operator = sc.next().charAt(0);
	 System.out.println("Enter the First number: ");
	 number1 = sc.nextDouble();
	 System.out.println("Enter The Second Number: ");
	 number2 = sc.nextDouble();
	 switch (operator){
	 case '+':
	 result = number1 + number2;
	System.out.println(result);break;
	 case '-':
	 result = number1 - number2;
	 System.out.println(result); break;
	 case '*':
	 result = number1 * number2;
	System.out.println(result);break;
    case '/':
		 result = number1 / number2;
		System.out.println(result);break;
		 default:
		 System.out.println("Invalid operator!");
		 break;
		 }
		 }
		}