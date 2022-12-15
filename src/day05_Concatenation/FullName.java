package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName ="İlkay";
        String lastName ="BAKIR";
        int age =40;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.75;


        String fullNAme = firstName + " "+lastName;

        System.out.println("Full name of the person is "+fullNAme);
        // Full name of the person is
        System.out.println(fullNAme+" is "+ age + " years old.");
        // ---- is ---- years old.
        System.out.println(fullNAme+" is " + jobTitle+" at "+ companyName+" and "+fullNAme+"`s salary is $"+salary);
    }

}
