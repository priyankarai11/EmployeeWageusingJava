import java.util.Random;
public class Employee {
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Problem");
	Random rand=new Random();
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
}
