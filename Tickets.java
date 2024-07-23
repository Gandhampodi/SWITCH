package Switch;

import java.util.Locale;

public class Tickets {
    public static void main(String agr[]) {
        int age = 67;
        int Ticketprice = 20;
        String dayofweek = "saturday";
        dayofweek = dayofweek.toLowerCase(Locale.ROOT);
        switch (dayofweek) {
            case "monday":
                System.out.println("Monday ticket price:" + Ticketprice);
                break;
            case "tuesday":
                System.out.println("Tuesday ticket price:" + Ticketprice);
                break;
            case "wednesday":
                System.out.println("wednesday ticket price:" + Ticketprice);
                break;
            case "thursday":
                System.out.println("Thursday ticket price:" + Ticketprice);
                break;
            case "friday":
                System.out.println("Friday ticket price:" + Ticketprice);
                break;
            default: {
                System.out.println("Invalid");
            }
        }
        switch (dayofweek) {
            case "saturday":
                System.out.println("Saturaday ticket price:" + Ticketprice);
            case "sunday":
                System.out.println("Sunday ticket price:" + Ticketprice);
                Ticketprice *= 0.8;
                break;
            default: {
                System.out.println("Invaild");
            }
        }


        if (age < 5) {
            System.out.println("Below five year Ticketprice:" + Ticketprice);
        } else if (age >= 5 && age <= 12) {
            System.out.println("children age  Ticketprice:" + Ticketprice);
        } else if (age >= 13 && age <= 17) {
            System.out.println("teen age Ticketprice:" + Ticketprice);
        } else if (age >= 18 && age <= 64) {
            System.out.println(" adult Ticketprice:" + Ticketprice);
        } else if (age >= 65) {
            System.out.println(" old age Ticketprice:" + Ticketprice);
        }

    }
}

