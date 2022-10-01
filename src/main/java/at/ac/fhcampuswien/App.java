package at.ac.fhcampuswien;


import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){

        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        /*String robot = "__\n
       "_(\ |@@|"+\n
        "(__/\__ \--/ __"+\n
" \___|----| | __"+
 "\ }{ /\ )_ / _\"+
 "/\__/\ \__O (__"+
              "  (--/\--) \__/"+
             "   _)( )(_"+
 "`---''---"*/

        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here

        Scanner scan = new Scanner(System.in);
        System.out.println("bitte geben Sie eine Zahl ein");
        int x = scan.nextInt();
        System.out.println("bitte geben Sie eine weitere Zahl ein");
        int y = scan.nextInt();

        System.out.println(x + y);
    }

    //todo Task 5 kein DreieckstauschSTEP 1: START.
    //STEP 2: ENTER x, y.
    //STEP 3: PRINT x, y.
    //STEP 4: x = x + y.
    //STEP 5: y= x - y.
    //STEP 6: x =x - y.
    //STEP 7: PRINT x, y.
    //STEP 8: END.
    public void swapTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("x = " + x);
        int y = scan.nextInt();
        System.out.println("y = " + y);
        System.out.println("");

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("x = " + x);
        int y = scan.nextInt();
        System.out.println("y = " + y);
        System.out.println("");

        if (x > y) {
            System.out.println("x ist größer als y");
        } else if (x == y) {
                System.out.println("x ist gleich groß wie y");
            } else {
            System.out.println("y ist größer als x");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scan = new Scanner(System.in);
        int umsatz = scan.nextInt();

        if (umsatz < 0 || umsatz >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (umsatz >= 0 && umsatz < 20000) {
            System.out.println("Poor Sales Revenue");
        }

            else if (umsatz >= 20000 && umsatz < 50000) {
            System.out.println("Average Sales Revenue");

        }
            else if (umsatz >= 50000 && umsatz < 80000) {
            System.out.println("Good Sales Revenue");
        }

            else if (umsatz >= 80000 && umsatz < 100000) {
                System.out.println("Excellent Sales Revenue");
            }




    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scan = new Scanner(System.in);
        int provision = scan.nextInt();

        switch (provision) {
            case 1:
                System.out.println("0,01");
                break;
            case 2:
                System.out.println("0,02");
                break;
            case 3:
                System.out.println("0,03");
                break;
            case 4:
                System.out.println("0,04");
                break;
            default: //in jedem anderen Fall
                System.out.println("Provision ist 0");

        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scan = new Scanner(System.in);
        int jahr = scan.nextInt();

        if (jahr % 100 == 0 && jahr % 400 != 0) {//bedeutet 1900 kein Schaltjahr, weil durch 100 teilbar
            System.out.println("Dieses Jahr ist kein Schaltjahr.");
        }
            else if (jahr % 4 == 0) {
            System.out.println("Dieses Jahr ist ein Schaltjahr.");
        } else {
            System.out.println("Dieses Jahr ist kein Schaltjahr."); //alle Jahre die nicht durch 4 oder 100 teilbar sind

        }
    }



    //todo Task 10
    public void transposedNumbers(){
        Scanner scan = new Scanner(System.in);
        int zahl = scan.nextInt();

        if (zahl < 1000) {

            while (zahl != 0) { //passiert während die Zahl nicht 0 ist
                int neueZahl = (zahl % 10); //neue Zahl ist der Rest der Zahl, wenn ich sie durch 10 dividiere
                System.out.print(neueZahl);
                zahl = zahl / 10;//Komma wird nach rechts verschoben
            }


        }

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}