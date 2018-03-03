import java.util.Scanner;
import java.text.DecimalFormat;
public class TripPlanner {
    double money;
    int days;
    double curRate;

    public static void main(String[] args) {
        intro();
        budget();
        time();
        distance();
    }


    public static void intro() {
        Scanner input = new Scanner(System.in);
        //takes in user name, and destination
        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name + ", Where are you traveling to?");
        String place = input.nextLine();
        System.out.println("Great! " + place + " sounds like a great trip.");


    }


    public static void budget() {
        Scanner input = new Scanner(System.in);
        //takes in days planned on trip, allowance and converting info
        System.out.println("How many days are you going to be spending on your trip?");
        int days = input.nextInt();
        System.out.println("How much money in, USD, are you planning on spending?");
        double money = input.nextDouble();
        System.out.println("What is the three letter currency symbol for your destination");
        String currency = input.next();
        System.out.println("How many " + currency + " is in one USD?");
        double curRate = input.nextDouble();
        System.out.println("If you are travelling for "+days+ " days that is the same as " + days*24 + " hours or " + days*24*60 +" minutes" );
        System.out.print("If you are going to spend $" + money);
        double moneyCal = money/days;   // Spend USD for a day
        // Decimal Format into #.##
        DecimalFormat format = new DecimalFormat("#.##");
        String moneyCalStr = format.format(moneyCal);
        System.out.println(" USD that means per day you can spend up to $"+moneyCalStr+ " USD");
        System.out.print("Your total budget in " + currency + " is " + (money*moneyTravel));
        double moneyTravelCal = money*moneyTravel/days; //Spend Foreign Currency for a day
        // Decimal Format into #.##
        String moneyTravelCalStr = format.format(moneyTravelCal);
        System.out.println(" "+currency+", which per day is "+moneyTravelCalStr+" "+currency);
        System.out.println("************");
        System.out.println();


    }

    public static void time() {
        Scanner input = new Scanner(System.in);
//takes in time difference between home and destination

        System.out.print("What is the time difference, in hours, between your ");
        System.out.print("home and your destination? ");
        int time = input.nextInt();
        System.out.print("That means that when it is midnight at home it will be ");
        int midNightTime = 0;
        if (time < 0) {  // Calculate time different
            midNightTime = time + 24;
        }else{
            midNightTime = time;
        }
        int noonTime = 0;
        if (time>=12){ // Calculate time different
            noonTime = 12 - (time - 12);
        } else {
            noonTime = time + 12;
        }
        System.out.println(midNightTime+":00 in your travel destination");
        System.out.println("and when it is noon at home it will be "+noonTime+":00");
        System.out.println("************");
        System.out.println();

    }




    public static void distance() {
        Scanner input = new Scanner(System.in);
//takes in distance between home and destination and converts square kilometers into square miles

        System.out.print("What is the square area of your destination ");
        System.out.print("country in km²? ");
        double squareArea = input.nextDouble();
        double squareAreaMile = 0.386102*squareArea;    // Km² --> Mile²
        // Decimal Format into #.##
        DecimalFormat format = new DecimalFormat("#.##");
        String squareAreaMileStr = format.format(squareAreaMile);
        System.out.println("in miles² that is " + squareAreaMileStr);
    }

    }


}
