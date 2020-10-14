import java.util.Random;
import java.util.Scanner;
public class Employee 
		
{		public static  String company;
	        public static  int empRatePerHour;
                public static  int numOfWorkingDays;
                public static  int maxHoursPerMonth;
                public static  int fullTime=1 , partTime=2;
		public static int totalWage;


	public  Employee(String company,int empRatePerHour, int numOfWorkingDays,int  maxHoursPerMonth){
	this.company=company;
	this. empRatePerHour= empRatePerHour;
	this. numOfWorkingDays= numOfWorkingDays;
	this. maxHoursPerMonth= maxHoursPerMonth;

	}

	public static void empWage( )
	{
		System.out.println("Welcome to Employee Wage Problem");
        	Random rand=new Random();
		String empName=" ";
		int empHr=0,days=0,totalEmpHrs=0;
		int totalSal=0;

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
       		//System.out.println("Calculating Daily wage Of Employee");
        	//int wageperDay=(wageperHour * hourperDay);
        	//System.out.println("Daily Employee wage:"+wageperDay);

        	System.out.println("****************************************");
        	System.out.println("Calculate wages for month");
        	System.out.println("Employee wage");
		//int num=1;
        	//System.out.println("Enter number of working days");
		while(totalEmpHrs<=maxHoursPerMonth && days<= numOfWorkingDays)
		{
			days++;
			int empCheck=rand.nextInt(2);
			switch(empCheck){
			case 0 :empName="Fulltime";
				empHr=empHr+8;
				break;
			case 1 :empName="Parttime";
				empHr=empHr+4;
				break;
		}
		totalEmpHrs=totalEmpHrs+empHr;
		System.out.println("Days :"+ days + " Employee Hour :" +empHr);
		}
		totalWage=totalEmpHrs * empRatePerHour;
	}
	@Override
	public String toString( ){
	return "Total Employee Wage for Company :"+company+" is :"+totalWage;
	}

	public static void main(String[] args)
	{
		Employee bridgeLabz=new Employee("BridgeLabz",20,2,10);
		bridgeLabz.empWage();
		System.out.println(bridgeLabz);
		Employee wipro=new Employee("Wipro",10,4,20);
		wipro.empWage();
		System.out.println(wipro);
	}


}
