package no.denniso.InteliJ;

public class LeapChecker {

    public LeapChecker() {
    }

    public boolean isLeapYear(int year){
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

}
