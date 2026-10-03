import java.util.Scanner;
public class TotalWaterUsage {
    public static int calculateTotal(int morningUsage, int eveningUsage)
     {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("Enter the water consumption in the morning : ");
        int morningUsage = scanner.nextInt();
System.out.println("Enter the water consumption in the evening : ");
        int eveningUsage = scanner.nextInt();

        int totalConsumption = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total Water Consumption: " + totalConsumption + " litres");

    }
}