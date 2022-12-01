import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        int totalDays = 0;
        Scanner in = new Scanner(System.in);
        SafeInputs SafeInput = null;
        int year = SafeInput.getRangedInt(in, "Enter Year", 1950, 2010);
        int month = SafeInput.getRangedInt(in, "Enter Month", 1, 12);
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                totalDays = 31;
                break;
            case 2:
                totalDays = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                totalDays = 30;
                break;
        }
        int day = SafeInput.getRangedInt(in, "Enter Day",  1, 31);
        int hours = SafeInput.getRangedInt(in, "Enter hours", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter minutes", 1, 59);
        System.out.println("You were born on " + month + "/" + day + "/" + year);
        System.out.println("Time of Birth: " + hours + ":" + minutes);
    }

}
