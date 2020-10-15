import java.util.Random;
import java.util.Scanner;
public class CompanyEmpWage{
		public final  String company;
	        public final  int empRatePerHour;
                public final  int numOfWorkingDays;
                public final  int maxHoursPerMonth;
		public  int totalEmpWage;
		public static final int partTime=1;
                public static final int fullTime=2;


	public CompanyEmpWage(String company,int empRatePerHour, int numOfWorkingDays,int  maxHoursPerMonth){
	this.company=company;
	this. empRatePerHour= empRatePerHour;
	this. numOfWorkingDays= numOfWorkingDays;
	this. maxHoursPerMonth= maxHoursPerMonth;
	empWage();

	}

	@override
	public String toString( ){
        return "Total Employee Wage for Company :"+company+" is :"+totalWage;
        }

	public void empWage( ) 
	{
		System.out.println("Welcome to Employee Wage Problem");
        	Random rand=new Random();
		String empName=" ";
		int empHr=0,days=0,totalEmpHrs=0;
		//int totalSal=0;

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
		//int num=1;
        	//System.out.println("Enter number of working days");
		while(days<maxHoursPerMonth && empHr< numOfWorkingDays)
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
		 //totalEmpHrs * empRatePerHour;
	}


	public class Employee {
		private CompanyEmpWage[] empWage;

		public Employee( ){
			empWage = new CompanyEmpWage[2];
		}




	public static void main(String[ ] args)
	{
		Employee emp=new Employee( );
		emp.empWage [0] = new CompanyEmpWage("BridgeLabz",20,2,10);
		emp.empWage[1] = new CompanyEmpWage("Wipro",10,4,20);
		for (int index=1;index<=2;index++){
			System.out.println(emp.empWage[index]);
		}
	}

   }

