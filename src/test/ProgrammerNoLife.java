package test;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgrammerNoLife
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
String inputLine = scanner.nextLine();
String[] digits = inputLine.split("");
ArrayList<Integer> realDigits = new ArrayList<>();
ArrayList<Integer> evenDigits = new ArrayList<>();
ArrayList<Integer> oddDigits = new ArrayList<>();
int evenSum = 0; int oddSum = 0;
for (int i = 0; i < digits.length; i++)
{realDigits.add(Integer.parseInt(digits[i]));}
for (int i = 0; i < realDigits.size(); i++)
{
if (realDigits.get(i)%2 == 0)
{evenDigits.add(realDigits.get(i));}
else {oddDigits.add(realDigits.get(i));}
}
for (int i = 0; i < evenDigits.size(); i++)
{evenSum+=evenDigits.get(i);}
for (int i = 0; i < oddDigits.size(); i++)
{oddSum+=oddDigits.get(i);}
if (evenSum > oddSum)
{System.out.println(evenSum+" energy drinks.");}
else if (oddSum > evenSum)
{System.out.println(oddSum+" cups of coffee.");}
else {System.out.println(evenSum+" of both.");}
}}