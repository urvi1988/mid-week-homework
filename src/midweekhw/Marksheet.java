package midweekhw;

public class Marksheet {
    public static void main (String [] args) { // main method
        float total, average, percentage; // floating point
        int G= 75; //  declaired variables
        int E= 60;
        int M= 65;
        int H= 70;
        int S= 80;

        System.out.println("Gujarat board of india");
        System.out.println("I.N.TekaravalaHighSchool");
        System.out.println("Exam number");
        System.out.println("Name: Urvi patel");
        System.out.println("Subjects     Obtained Marks  ");
        System.out.println("Gujarati:          75");
        System.out.println("English:           60");
        System.out.println("Maths:             65");
        System.out.println("Hindi:             70");
        System.out.println("Science:           80");

        total= G+ E+ M+ H+ S;
        average= total/ 5;
        percentage= (total/500)*100;
        System.out.println("Total marks = " +total) ;
        System.out.println("average marks= " +average) ;
        System.out.println("percentage marks= " +percentage);













    }


}
