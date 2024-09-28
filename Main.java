import java.util.Scanner;

public class Main{

    public static void main(String[]args){
        int number, ans, choice;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while(flag){

            System.out.println("-------------------------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Close Program");
            System.out.println("-------------------------------");

            System.out.print("Select Option:");
            choice = sc.nextInt();
            System.out.println("-------------------------------");

            if(choice == 1){
                System.out.print("Enter a Number: ");
                number = sc.nextInt();

            
                for(int i = 1; i<=10; i++){
                    ans = number + i;
                    System.out.println(number + " + " + i + " = " + ans);
                    }
            }
            else if(choice == 2){
                System.out.print("Enter a Number: ");
                number = sc.nextInt();

            
                for(int i = 1; i<=10; i++){
                    ans = number - i;
                    System.out.println(number + " - " + i + " = " + ans);
                }

            }
            else if(choice == 3){
                System.out.print("Enter a Number: ");
                number = sc.nextInt();

            
                for(int i = 1; i<=10; i++){
                    ans = number * i;
                    System.out.println(number + " * " + i + " = " + ans);
                }

            }
            else if(choice == 4){
                System.out.print("Enter a Number: ");
                number = sc.nextInt();

            
                for(int i = 1; i<=10; i++){
                    ans = number / i;
                    System.out.println(number + " / " + i + " = " + ans);
                }

            }
            else if(choice == 5){
                System.out.println("Program Closed");
                flag = false;
            }
            else{
                System.out.println("Invalid Input");
            }
            

        }
        

    }

    
}
