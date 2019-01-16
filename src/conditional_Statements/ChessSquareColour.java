package conditional_Statements;
import java.util.Scanner;

public class ChessSquareColour
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
char file = scanner.nextLine().charAt(0);
int rank = Integer.parseInt(scanner.nextLine());
if (rank >= 1 && rank <= 8)
{
if (file == 'a' || file == 'c' || file == 'e' || file == 'g')
{
if (rank%2 == 0) {System.out.println("light");}
else {System.out.println("dark");}
}
else if (file == 'b' || file == 'd' || file == 'f' || file == 'h')
{
if (rank%2 == 0) {System.out.println("dark");}
else {System.out.println("light");}
}}}}