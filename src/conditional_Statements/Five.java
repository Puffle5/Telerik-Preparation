package conditional_Statements;
import java.util.Scanner;
public class Five
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
Double first = Double.parseDouble(scanner.nextLine());
Double second = Double.parseDouble(scanner.nextLine());
Double third = Double.parseDouble(scanner.nextLine());
Double fourth = Double.parseDouble(scanner.nextLine());
Double fifth = Double.parseDouble(scanner.nextLine());
if (first >= -200 && first <= 200 && second >= -200 && second <= 200 && third >= -200 && third <= 200 && fourth >= -200 && fourth <= 200 && fifth >= -200 && fifth <= 200)
{
if (first >= second && first >= third && first >= fourth && first >= fifth)
{
if (first - (Math.floor(first)) == 0) {System.out.println(first.intValue());}
else {System.out.println(first);}
}
else if (second >= first && second >= third && second >= fourth && second >= fifth)
{
if (second - (Math.floor(second)) == 0) {System.out.println(second.intValue());}
else {System.out.println(second);}
}
else if (third >= first && third >= second && third >= fourth && third >= fifth)
{
if (third - (Math.floor(third)) == 0) {System.out.println(third.intValue());}
else {System.out.println(third);}
}
else if (fourth >= first && fourth >= second && fourth >= third && fourth >= fifth)
{
if (fourth - (Math.floor(fourth)) == 0) {System.out.println(fourth.intValue());}
else {System.out.println(fourth);}
}
else
{
if (fifth - (Math.floor(fifth)) == 0) {System.out.println(fifth.intValue());}
else {System.out.println(fifth);}
}}}}

