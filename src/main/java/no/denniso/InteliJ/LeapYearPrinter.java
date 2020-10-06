package no.denniso.InteliJ;

public class LeapYearPrinter {                                      // need to refactor





    public static void main(String[] args) {
        int MIN = 1800;     // define minimal year range value
        int MAX = 2400;     // define maximum year range value
        LeapChecker check = new LeapChecker();
        for(int i = MIN; i<= MAX; i++){
//            if(isLeapYear(i))
                System.out.println( i + (check.isLeapYear(i) ? " <---LEAP-YEAR" : " "));
        }
    }
}

