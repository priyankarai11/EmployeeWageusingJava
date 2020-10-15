import java.util.*;
import java.util.Random;
import java.util.Scanner;

interface EmployeeWageInterface {
    void empWage(List<EmpWageBuilder> arraylist,int index);
}

class EmpWageBuilder implements EmployeeWageInterface{
    Map<String,Double> salaryMap = new HashMap<>();
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

    public void empWage(List<EmpWageBuilder> arraylist,int index) {
        double wage;
        int HOURS_PER_DAY = 0;
        String str = "";
        double TOTAL_SALARY=0;
        int TOTAL_HOURS=0;
        //int FULL_TIME_HOUR=0;
        //int PART_TIME_HOUR=0;
        Random rand = new Random();
	System.out.println("******************************************************************");
        Map<Integer,Double> map = new HashMap<>();
        System.out.println("Calculating Wages for a Particular Company  : "+arraylist.get(index).Company+" ");
        for(int i=1;i<=arraylist.get(index).NUM_WORK_DAYS;i++) {
            if(TOTAL_HOURS <= arraylist.get(index).WORK_HOUR_PER_MONTH) {
                int empCheck=rand.nextInt(2);
                switch (empCheck) {
                    case 1:
                        str = "Full Time";
                        HOURS_PER_DAY = 8;
                        TOTAL_HOURS += HOURS_PER_DAY;
                        break;
                    case 2:
                        str = "Part Time";
                        HOURS_PER_DAY = 4;
                        TOTAL_HOURS += HOURS_PER_DAY;
                        break;
                }
                wage = (HOURS_PER_DAY) * arraylist.get(index).WAGE_PER_HOUR;
		map.put(i,wage);
                TOTAL_SALARY += wage;
            } else {
                break;
            }
        }
        System.out.println("Day       DailyWage");
        for ( Map.Entry<Integer, Double>  t  :  map.entrySet() )  {
            System.out.println(t.getKey() +"        "+t.getValue());
        }

        System.out.println();
        System.out.println(arraylist.get(index).Company+" Total Working hours = "+TOTAL_HOURS);
        salaryMap.put(arraylist.get(index).Company,TOTAL_SALARY);
	}
	
	public void display(String Company){
        System.out.println(Company+" : "+salaryMap.get(Company));
	   
 }
}

	public class Employee extends EmpWageBuilder{
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

        public static void main(String[] args){
        System.out.println("Welcome to Employee Computation program\n");

	List<EmpWageBuilder> arraylist = new ArrayList<>();

        EmpWageBuilder bridgeLabz = new EmpWageBuilder("BridgeLabz",25,200,160);
        EmpWageBuilder wipro = new EmpWageBuilder("Wipro",20,150,100);

        arraylist.add(bridgeLabz);
        arraylist.add(wipro);

        checkAttendance();

        bridgeLabz.empWage(arraylist,0);
        wipro.empWage(arraylist,1);
    }
}
