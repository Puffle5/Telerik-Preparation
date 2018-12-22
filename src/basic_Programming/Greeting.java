package basic_Programming;
import java.util.Scanner;

public class Greeting
{
public static void main(String[] arguments)
{//A simple printing program for saluting anyone:
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
System.out.printf("Hello, %s!", name);
}}
