import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();
        int Arr[] = new int[Length];
        for(int i = 0; i <Length; i++){
            Arr[i] = sc.nextInt();
        }
        for(int j = Length-1; j>=0; j--){
            System.out.print(Arr[j] + " ");
        }
    }
}

