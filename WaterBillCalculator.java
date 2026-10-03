import java.util.Scanner;
public class WaterBillCalculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the water consumption in liters: ");
        int waterConsumption = sc.nextInt();
        double billAmount = 0.0;
        if(waterConsumption<=500){
            billAmount=100;
        }
            else{
                billAmount=200;
            
            }
System.out.println("The water bill amount is: " + billAmount);
        
    }
}