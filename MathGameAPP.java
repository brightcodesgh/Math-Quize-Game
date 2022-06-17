import java.util.Random;
import java.util.Scanner;

public class MathGameAPP {

    public static void main(String[]args){
        Random random = new Random();

        int num1;
        int num2; 
        int num3;
        int over = 10;
        int answer;
        int correct_answer;
        String response = "";
        int score = 0;
        double percentage;

        System.out.println("\t>><><>> WELCOME TO THE RANDOM MATH GAME >><<>>< ");
        System.out.println();
        Scanner scan = new Scanner(System.in);

        for(int count = 1; count <= over; count ++){

            num1 = random.nextInt(10)+1;
            num2 = random.nextInt(10)+1;
            num3 = random.nextInt(10)+1;
            System.out.println(count+ ". What is "+ num1 +" + " + num2 +" x "+ num3 + " :");
            answer = scan.nextInt();

            correct_answer = num1 + num2 * num3;
             if(answer == correct_answer){
                 switch(random.nextInt(4)+1){

                    case 1:
                    response = "<<< Correct";
                    break;

                    case 2:
                    response = "<<< Great";
                    break;

                    case 3:
                    response = "<<< Perfect";
                    break;

                    case 4: 
                    response = "<<< Right Answer";
                    break;


                 }
                 System.out.println(response);
                 score ++;

             }
             else{
                 System.out.println("<<< Wrong Answer");
             }

        }
        

        percentage = (double)score / (double)over * 100;

        System.out.println();
        System.out.println("==========================================");
        System.out.print("Your Score is " + score + "/"+ over + " = ");
        System.out.printf("%.0f", percentage);
        System.out.print("%");
        System.out.println("\n==========================================");

        scan.close();

     



    }
    
}
