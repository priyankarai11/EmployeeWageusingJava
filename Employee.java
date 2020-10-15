import java.util.*;
import java.util.Random;
import java.util.Scanner;

interface EmployeeWageInterface {
    double calculateWage(EmpWageBuilder[] array,int index);
}

class EmpWageBuilder implements EmployeeWageInterface {
    public String Company;
    public int NUM_WORK_DAYS;
    public double WAGE_PER_HOUR;
    public int WORK_HOUR_PER_MONTH;

    EmpWageBuilder(String Company,int NUM_WORK_DAYS,double WAGE_PER_HOUR,int WORK_HOUR_PER_MONTH) {
        this.Company = Company;
        this.NUM_WORK_DAYS = NUM_WORK_DAYS;
        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
        this.WORK_HOUR_PER_MONTH = WORK_HOUR_PER_MONTH;
    }

    public double calculateWage(EmpWageBuilder[] array,int index) {
        double wage;
        int HOURS_PER_DAY = 0;
        String str = "";
        double TOTAL_SALARY=0;
        int TOTAL_HOURS=0;
        int FULL_TIME_HOUR=0;
        int PART_TIME_HOUR=0;
        Random rand = new Random();
        Map<String,Integer> map = new HashMap<>();
        System.out.println("Calculating Wages for a month of "+array[index].Company+" ");
        for(int i=1;i<=array[index].NUM_WORK_DAYS;i++) {
            if(TOTAL_HOURS <= array[index].WORK_HOUR_PER_MONTH) {
                int empCheck=rand.nextInt(2);
                switch (empCheck) {
                    case 1:
                        str = "Full Time";
                        HOURS_PER_DAY = 8;
                        TOTAL_HOURS += HOURS_PER_DAY;
                        FULL_TIME_HOUR+=HOURS_PER_DAY;
                        map.put(str,FULL_TIME_HOUR);
                        break;
                    case 2:
                        str = "Part Time";
                        HOURS_PER_DAY = 4;
                        TOTAL_HOURS += HOURS_PER_DAY;
                        PART_TIME_HOUR+=HOURS_PER_DAY;
                        map.put(str,PART_TIME_HOUR);
                        break;
                }
                wage = (HOURS_PER_DAY) * array[index].WAGE_PER_HOUR;
                TOTAL_SALARY += wage;
            } else {
                break;
            }
        }
        System.out.println("EmployeeType and WorkingHours");
        for ( Map.Entry<String, Integer>  t  :  map.entrySet() )  {
            System.out.println(t.getKey() +" -> "+t.getValue());
        }

        System.out.println();
        System.out.println(Company+" Total Working hours = "+TOTAL_HOURS);
        return TOTAL_SALARY;
    }
}

public class Employee
 extends EmpWageBuilder{
    Employee(String Company, int NUM_WORK_DAYS, double WAGE_PER_HOUR, int WORK_HOUR_PER_MONTH) {
        super( Company, NUM_WORK_DAYS, WAGE_PER_HOUR, WORK_HOUR_PER_MONTH );
    }

    public static void checkAttendance() {
        System.out.println("Checking Whether Employee Present Or Absent");
	Random rand = new Random();
        int i=rand.nextInt(2);
        	if (i == 1)
        	{
                	System.out.println("Employee Present");
        	}
        	else
        	{
                	System.out.println("Employee Absent");
        	}
    }

    @Override
    public String toString() {
        return "Company name "+Company+"\nnumber of working days "+NUM_WORK_DAYS+"\nWage per Hour "+WAGE_PER_HOUR+"\nWorking Hours Per Month "+WORK_HOUR_PER_MONTH;
    }

    public static void main(String[] args){
        System.out.println("Welcome to Employee Computation program\n");

        Employee[] array = new Employee[2];

        Employee bridgeLabz = new Employee("Philips",22,200,176);
        Employee wipro = new Employee("Wipro",20,150,165);

        array[0] = bridgeLabz;
        array[1] = wipro;

        checkAttendance();

        System.out.println("Given details of Companies");
        for(Employee details:array){
            System.out.println(" ");
            System.out.println(details);
        }
        System.out.println("*----------------------------------------------*");

        //Employee wage calculation
        System.out.println("Total Salary = "+bridgeLabz.calculateWage(array,0)+"\n");
        System.out.println("Total Salary = "+wipro.calculateWage(array,1)+"\n");
    }
}