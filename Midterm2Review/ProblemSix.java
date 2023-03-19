package Midterm2Review;

public class ProblemSix {
    double feet;
    double inches;

    public ProblemSix(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }
    public void setValues(double feet, double inches){
        while(inches>12){
            feet = feet + 1;
            inches = inches - 12;
        }
        this.inches = inches;
        this.feet = feet;
    }
    public String toString(){
        return feet +" feet is " + inches +" inches.";
    }

}
