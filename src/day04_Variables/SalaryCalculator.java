package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
                    // calculate salary with hourly rate and weekly hours

         int hourlyRate = 50;
         int weeklyHours = 40 ;
         int numberOfWeeks = 52;

         int salary = hourlyRate * weeklyHours * numberOfWeeks;
                                                                //System.out.println(salary);
        System.out.println("haurlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary);

                }

}
