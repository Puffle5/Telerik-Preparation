package conditional_Statements;
import java.util.Scanner;

public class Three
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
Double first = Double.parseDouble(scanner.nextLine());
Double second = Double.parseDouble(scanner.nextLine());
Double third = Double.parseDouble(scanner.nextLine());

if (first >= -200 && first <= 200 && second >= -200 && second <= 200 && third >= -200 && third <= 200)
{
if ((first > second && first > third) || (first.equals(second) && first > third)
|| (first.equals(third) && first > second) || (first.equals(second) && first.equals(third)))
{
if (first - (Math.floor(first)) == 0) {System.out.println(first.intValue());}
else {System.out.println(first);}
}
else if ((second > first && second > third) || (second.equals(third) && second > first))
{
if (second - (Math.floor(second)) == 0) {System.out.println(second.intValue());}
else {System.out.println(second);}
}
else if (third > first && third > second)
{
if (third - (Math.floor(third)) == 0) {System.out.println(third.intValue());}
else {System.out.println(third);}
}}}}

