package Arrays;

import java.util.Arrays;

public class CallbyValue
{

	public static void main(String[] args) {
 		
          float salary[] =  {45000.0f};
          float salaryCopy[] = Arrays.copyOf(salary, 1);
          System.out.println(salary[0]);
          applyBonus(salary);// reference as value
          System.out.println("After bonus:-");
          System.out.println(salaryCopy[0]);
	}
	public static void applyBonus(float[] salary2) {
		salary2[0] = salary2[0] + 5000.0f;
		System.out.println("Inside: "+ salary2[0]);
	}
}
