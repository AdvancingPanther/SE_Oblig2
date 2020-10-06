package no.denniso.InteliJ;

//// PRINTER UT ALLE ÅR mellom året 1 A.C - frem til året 2400
//// OG MARKERER DE ÅRENE SOM ER ET SKUDD ÅR

public class LeapYearPrinter {

    public static void main(String[] args) {
        int MIN = 1;     // define minimal year range value
        int MAX = 2400;     // define maximum year range value
        LeapChecker check = new LeapChecker();
        for(int i = MIN; i<= MAX; i++){
//            if(isLeapYear(i))
                System.out.println( i + (check.isLeapYear(i) ? " <---LEAP-YEAR" : " "));
        }
    }
}

