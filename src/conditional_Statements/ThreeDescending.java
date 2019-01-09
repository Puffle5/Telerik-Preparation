package conditional_Statements;
import java.util.Scanner;

public class ThreeDescending
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
int first = Integer.parseInt(scanner.nextLine());
int second = Integer.parseInt(scanner.nextLine());
int third = Integer.parseInt(scanner.nextLine());

if (first >= -1000 && first <= 1000 && second >= -1000 && second <= 1000 && third >= -1000 && third <= 1000)
{
for (int i = 0; i < 3; i++)
{
int temporary;
if (first < second)
{
temporary = first; first = second; second = temporary;
if (second < third) {temporary = second; second = third; third = temporary;}
}
else if (first > second)
{if (second < third) {temporary = second; second = third; third = temporary;}}
}
System.out.printf("%d %d %d", first, second, third);
}}}