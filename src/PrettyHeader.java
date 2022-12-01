import java.util.Scanner;
public class PrettyHeader
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your message (60 character limit): ");
        String msg = in.nextLine();
        SafeInputs.prettyHeader(msg);
    }
}