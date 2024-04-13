import java.util.*;
public class Solution{
    public static int total_cost(double meal_cost, int tip_percent, int tax_percent){
        double tip = (meal_cost/100)*tip_percent;
        double tax = ((double)tax_percent/100)*(double)meal_cost;
        long total_cost = Math.round(meal_cost + tip + tax);
        return (int)total_cost;
    }
    public static void main(String arhs[]){
        Scanner sc = new Scanner(System.in);
        double meal_cost = sc.nextFloat();
        sc.nextLine();
        int tip_percent = sc.nextInt();
        int tax_percent = sc.nextInt();
        System.out.print(total_cost(meal_cost, tip_percent, tax_percent));
        
    }
}
