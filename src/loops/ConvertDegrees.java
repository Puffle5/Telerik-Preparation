package loops;
import java.util.Scanner;

public class ConvertDegrees
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
String[] degrees = input.split(" ");
for (String item: degrees)
{
double result = Math.round(Double.parseDouble(item)*9/5 + 32);
System.out.println((int)result);
}}}
