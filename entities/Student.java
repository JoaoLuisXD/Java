package entities;

public class Student {
    public String name;
    public double n1,n2,n3;
    public double result = n1 + n2 + n3;
    public double missingPoints;

    public void testScore()
    {
        if(result >= 60){
            System.out.println("Approved");
        }
        else{
            System.out.println("Failed");
            missingPoints = 60 - result;
        } 
    }
}
