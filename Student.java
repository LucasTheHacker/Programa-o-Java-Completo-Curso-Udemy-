package entities;
public class Student {
    public String name;
    public double notaTrim1;
    public double notaTrim2;
    public double notaTrim3;
    
    public double finalGrade() {
        return notaTrim1+notaTrim2+notaTrim3;
    }
    public void showSituacion() {
        if (finalGrade() >= 60.00) {
            System.out.printf("FINAL GRADE = %.2f\nPASS\n", finalGrade());
        }
        else {
            System.out.printf("FINAL GRADE = %.2f\nFAILED\nMISSING %.2f POINTS\n", finalGrade(), Math.abs(finalGrade()-60.00));
        }
    }

}
