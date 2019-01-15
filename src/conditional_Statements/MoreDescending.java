package conditional_Statements;
import java.util.Scanner;

public class MoreDescending
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
int first = Integer.parseInt(scanner.nextLine());
int second = Integer.parseInt(scanner.nextLine());
int third = Integer.parseInt(scanner.nextLine());

if (first >= -1000 && first <= 1000 && second >= -1000 && second <= 1000 && third >= -1000 && third <= 1000)
{
int max = Math.max(first, Math.max(second, third));
int min = Math.min(first, Math.min(second, third));
int average = first + second + third - (max + min);
System.out.println(max+" "+average+" "+min);
}}}