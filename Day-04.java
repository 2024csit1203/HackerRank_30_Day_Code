import java.util.*;
public class Main{
    public static void person(int age){
        if(age<0){
            System.out.println("Age is not valid, setting age to 0.");
            
            
        }
        else if(age<13){
            System.out.println("You are young.");
        }
        else if(age>=13 && age<18){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are old.");
        }
    }
    // public static void yearpasses(int age){
    //     age++;
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int age = sc.nextInt();
            person(age);
            // for(int j = 0; j<3; j++){
            //     age++;
            // }
            if(age<0){
                age = 0;
                person(age);
            }
            age = age +3;
            person(age);
            System.out.println();
        }
    }
}
