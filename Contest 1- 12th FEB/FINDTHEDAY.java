package letsdoit;
import java.util.Scanner;
public class FINDTHEDAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int t=sc.nextInt();//Enters the number of test cases.
        while(t-->0)
        {
            int d=sc.nextInt();//Accepts the date of the month.
            if(d>=3)
            {
            /*
            It is given that 1 is Monday so accordingly
            2-TUESDAY
            3-WEDNESDAY
            4-THURSDAY
            5-FRIDAY
            6-SATURDAY
            7-SUNDAY
            8-MONDAY

            It is noted that whenever there is a number such that its remainder on being divided by 7 matches the first               week, It gives the same day.
            */
                int mod=d%7; //Finds remainder in order to find the day.
                if(mod==0)
                  {
                System.out.println("SUNDAY");
                  }
                else if(mod==1)
                {
                    System.out.println("MONDAY");
                }
                else if(mod==2)
                {
                    System.out.println("TUESDAY");
                }
                else if(mod==3)
                {
                    System.out.println("WEDNESDAY");
                }
                else if(mod==4)
                {
                    System.out.println("THURSDAY");
                }
                else  if(mod==5)
                {
                    System.out.println("FRIDAY");
                }
                else if(mod==6)
                {
                    System.out.println("SATURDAY");
                }

 /*
            Another approch can be
                We create a string array with the name of days as its elements
                String[] name={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
                System.out.println(name[mod]);

  */
            }
            else
            {
                System.out.println("STUDY");//Exams aren't over. Cannot go on the trip.
            }


        }
    }
}
