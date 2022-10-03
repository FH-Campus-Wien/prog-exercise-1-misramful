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

        char zahl1 = 'Z';
        int zahl2 = 0xface;
        int zahl3 = 012;
        long zahl4 = 80L;
        float zahl5 = 44e-1f;
        float zahl6 = 5.5f;
        double zahl7 = 8.88e1;
        double zahl8 = 99.9;

        int zahl4a = (int) zahl4;
        int zahl5a = (int) zahl5;
        int zahl6a = (int) zahl6;
        int zahl7a = (int) zahl7;
        int zahl8a = (int) zahl8;

        int sum = (zahl1 + zahl2 + zahl3 + zahl4a + zahl5a + zahl6a + zahl7a + zahl8a);
        System.out.println(sum);
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here

        Scanner scan = new Scanner(System.in);
       // System.out.println("bitte geben Sie eine Zahl ein");
        int x = scan.nextInt();
       // System.out.println("bitte geben Sie eine weitere Zahl ein");
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
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scan.nextInt();
      //  System.out.println("");
       //System.out.println("x = " + x);
        System.out.print("y: ");
        int y = scan.nextInt();
     //   System.out.println("");
       //System.out.println("y = " + y);
       // System.out.println("");

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
        int x = scan.nextInt();
        System.out.print("n2: ");
        int y = scan.nextInt();


        if (x > y) {
            System.out.println("n1 > n2");
        } else if (x == y) {
                System.out.println("n1 == n2");
            } else {
            System.out.println("n2 > n1");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
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

        else //if (umsatz >= 80000 && umsatz < 100000)
             {
                System.out.println("Excellent Sales Revenue");
            }




    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int provision = scan.nextInt();

        switch (provision) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default: //in jedem anderen Fall
                System.out.println("Your Commission Rate was set to 0.0");

        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int jahr = scan.nextInt();
        if (jahr % 100 == 0 && jahr % 400 != 0) {//bedeutet 1900 kein Schaltjahr, weil durch 100 teilbar
            System.out.println("Not a Leapyear");
        }
            else if (jahr % 4 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear"); //alle Jahre die nicht durch 4 oder 100 teilbar sind

        }
    }



    //todo Task 10
    public void transposedNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
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