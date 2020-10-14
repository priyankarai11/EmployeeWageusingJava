import java.util.Scanner;
import java.util.Random;
public class Employee {
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Problem");
	Random rand=new Random();
        int i=rand.nextInt(2);
	int wageperHour=20;
	int hourperDay=8,empHour=0,num=20;
	String empName=" ";
	int salary=0 , totalSal=0 , fullTime=1 , partTime=2;
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
        System.out.println("Enter number of working days");
	System.out.println("Calculate wages for month");
	//Scanner sc=new Scanner(System.in);
	//int num=sc.nextInt();
	int day=1;
	while(day<=20 && empHour<=100)
	{
		int empCheck=rand.nextInt(2);
		switch(empCheck){
		case 0 :empName="Fulltime";
			empHour+=8;
			break;
		case 1 :empName="Parttime";
			empHour+=4;
			break;
		}
		salary=(empHour*wageperHour);
		System.out.println("Salary of " + empName + " on the " +day+ " is " +salary);
		totalSal=(totalSal+salary);
		day++;
	}
	System.out.println("Total Salary="+totalSal);

}
}
