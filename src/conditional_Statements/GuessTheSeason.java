package conditional_Statements;
import java.util.Scanner;

public class GuessTheSeason
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
String month = scanner.nextLine();
int date = Integer.parseInt(scanner.nextLine());
if (date >= 1 && date <= 31)
{
switch (month)
{
case "March": if (date <= 19) {System.out.println("Winter");}
                         else {System.out.println("Spring");} break;

case "April": if (date <= 30) {System.out.println("Spring");} break;

case "May": System.out.println("Spring"); break;

case "June": if (date <= 20) {System.out.println("Spring");}
else if (date >= 21 && date <= 30) {System.out.println("Summer");} break;

case "July": System.out.println("Summer"); break;

case "August": System.out.println("Summer"); break;

case "September": if (date <= 21) {System.out.println("Summer");}
else if (date >= 22 && date <= 30) {System.out.println("Autumn");} break;

case "October": System.out.println("Autumn"); break;

case "November": if (date <= 30) {System.out.println("Autumn");} break;

case "December": if (date <= 20) {System.out.println("Autumn");}
                            else {System.out.println("Winter");} break;

case "January": System.out.println("Winter"); break;

case "February": if (date <= 29) {System.out.println("Winter");} break;
}}}}