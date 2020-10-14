import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class Employee 
{

		public static final int wageperHour=20;
                public static final int hourperDay=8;
                public static final int parttimeHoursperDay=4;
                public static final int fullTime=1 , partTime=2;


        public static void empWage( )
        {
                System.out.println("Welcome to Employee Wage Problem");
                Random rand=new Random();
                String empName=" ";
                int day=1,empHour=0,totalSal=0,salary;
		int i=rand.nextInt(2);
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
        	System.out.println("Calculate wages for month");
        	System.out.println("Employee wage");

        	System.out.println("Enter number of working days");
		while(day<=20 && empHour<=100)
		{
			int empCheck=rand.nextInt(2);
			switch(empCheck){
			case 0 :empName="Fulltime";
				empHour=empHour+8;
				break;
			case 1 :empName="Parttime";
				empHour=empHour+4;
				break;
		}
		salary=(empHour*wageperHour);
		System.out.println("Salary of " + empName + " on the " +day+ " is " +salary);
		totalSal=(totalSal+salary);
		day++;
	}
	System.out.println("Total Employee Wage="+totalSal);

}
	public static void main(String[] args)
	{
		Employee empSal=new Employee();
		empSal.empWage();
	}


}
