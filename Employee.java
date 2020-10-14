import java.util.Random;
public class Employee {
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Problem");
	Random rand=new Random();
        int i=rand.nextInt(2);
	int wageperHour=20;
	int hourperDay=8;
	int parttimeHoursperDay=4;
        if (i == 1)
        {
                System.out.println("Employee Present");
        }
        else
        {
                System.out.println("Employee Absent");
        }
	System.out.println("****************************************");
	System.out.println("Calculating Daily wage Of Employee");
	int wageperDay=(wageperHour * hourperDay);
	System.out.println("Daily Employee wage:"+wageperDay);

	System.out.println("****************************************");
        System.out.println("Calculating part time Employee and wage");
        int parttimewageperDay=(wageperHour * parttimeHoursperDay);
        System.out.println("Daily Employee wage:"+parttimewageperDay);

}
}
