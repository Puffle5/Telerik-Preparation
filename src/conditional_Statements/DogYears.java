package conditional_Statements;
import java.util.Scanner;
public class DogYears
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
int humanYears = Integer.parseInt(scanner.nextLine());
int dogYears;
if (humanYears >= 0 && humanYears <= 15)
{
if (humanYears <= 2)
{dogYears = humanYears*10; System.out.println(dogYears);}
else
{dogYears = 2*10 + (humanYears - 2)*4; System.out.println(dogYears);}
}}}

