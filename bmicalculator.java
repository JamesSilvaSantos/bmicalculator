eimport java.util.Scanner;

public class bmicalculator{

	 public static void main(String[] args) {
	 	Scanner scan = new Scanner(System.in); 

        double weight = 0;
        double height = 0;
        String result="";
        String patient="";

        System.out.println("============================================================================");
        System.out.println(" bbbi mmmmm i   ccccc aaaaa l     ccccc u   u l     aaaaa ttttt ooooo rrr   ");                 
        System.out.println(" b  b m m m i   c     a   a l     c     u   u l     a   a   t   o   o r  r  ");
        System.out.println(" bbb  m m m i   c     aaaaa l     c     u   u l     aaaaa   t   o   o rrr   ");                                 
        System.out.println(" b  b m m m i   c     a   a l     c     u   u l     a   a   t   o   o r  r  ");                               
        System.out.println(" bbb  m m m i   ccccc a   a lllll ccccc uuuuu lllll a   a   t   ooooo r   r ");                                      
        System.out.println("============================================================================");

        System.out.println("----------------------------------------------------------------------------");
		System.out.print("Patient's Name: ");
        patient=scan.nextLine();
        System.out.print("Height(Cm): ");
		height=scan.nextInt();
		System.out.print("Weight(Kg): ");
		weight=scan.nextInt();
        System.out.println("----------------------------------------------------------------------------");

        double bmi = weight / (height * height);
     
		if(bmi < 0.0018){
			result="Underweight";
		}else if(bmi >= 0.0018 && bmi <= 0.0025){
			result="Normal Weight";
		}else if(bmi >= 0.0025 && bmi <= 0.0030){
			result="Overweight";
		}else if(bmi >= 0.0030 && bmi<= 0.0040){
			result="Obesity";
		}else if(bmi >= 0.0040){
			result="Severe Obesity";
		}

		System.out.println("===========================================");
		System.out.println(" rrr   eeeee sssss u   u l     ttttt sssss ");
		System.out.println(" r  r  e     s     u   u l       t   s     ");
		System.out.println(" rrr   eee   sssss u   u l       t   sssss ");
		System.out.println(" r  r  e         s u   u l       t       s ");
		System.out.println(" r   r eeeee sssss uuuuu lllll   t   sssss ");
		System.out.println("===========================================");
		System.out.println("-------------------------------------------");
		System.out.printf("Patient: %s%n",patient);
		System.out.printf("Weight: %s%n",weight);
		System.out.printf("Height: %s%n",height);
		System.out.printf("BMI: %s%n",result);
		System.out.println("-------------------------------------------");

        System.out.println("====================");
        System.out.println(" eeeee n    n ddd   ");
        System.out.println(" e     n n  n d  d  ");
        System.out.println(" eee   n  n n d   d ");
        System.out.println(" e     n   nn d  d  ");
        System.out.println(" eeeee n    n ddd   ");
        System.out.println("====================");
	}
}

