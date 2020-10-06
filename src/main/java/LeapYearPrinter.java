

public class LeapYearPrinter {                                      // need to refactor

    static int MIN = 1800;     // define minimal year range value
    static int MAX = 2400;     // define maximum year range value

    public static boolean isLeapYear(int year){
        boolean answer = false;

        if((year % 4 == 0) && (year%100 != 0))
            answer = true;

        if(year % 400 == 0)
            answer = true;

        if(year % 4 != 0)
            answer = false;

        if((year % 100 == 0) && (year % 400 != 0))
            answer = false;

        return answer;
    }


    public static void main(String[] args) {
        for(int i = MIN; i<= MAX; i++){
//            if(isLeapYear(i))
                System.out.println( i + (isLeapYear(i) ? " <---LEAP-YEAR" : " "));
        }
    }
}

