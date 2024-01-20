import java.util.*;

public class CalorieProgram{
    /*** Global Variables ***/
    static int user_age;
    static int user_weight;
    static double user_height;
    static double user_maintenance; 
    static String user_gender;
    static int gender_factor;
    static int activity_factor;

    // Main Menu 
    public static void main(String[] args) {
        System.out.println("Welcome to the calorie program!");
        System.out.println("This program will help you calculate your calories!");
        System.out.println("To calculate your calories, you will need to enter some details!");

        // Asks for users gender and sets gender factor 
        System.out.println("Are you male or female?");
        Scanner genderReader = new Scanner(System.in);
        user_gender = genderReader.nextLine();
        if (user_gender == "male") {
            gender_factor = (+5);
        } else if (user_gender == "female"){
            gender_factor = (-161);
        }

        System.out.println("Please enter your age: ");      // Asks for users age 
        Scanner ageReader = new Scanner(System.in);         
        user_age = ageReader.nextInt();           

        System.out.println("Please enter your weight: ");   // Asks for users weight
        Scanner weightReader = new Scanner(System.in);     
        user_weight = weightReader.nextInt();

        System.out.println("Please enter your height: ");   // Asks for users height
        Scanner heightReader = new Scanner(System.in);     
        user_height = heightReader.nextDouble();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        
        user_maintenance = (10 * user_weight) + (6.25 * user_height) - (5 * user_age) + gender_factor * activity_factor;
        System.out.println("Based on the details you have entered your calorie maintenance is: " + user_maintenance);

        System.out.println("Please choose one of the following options");
        System.out.println("1: Weight gain");
        System.out.println("2: Weight loss");
        Scanner reader = new Scanner(System.in);    
        int input = reader.nextInt();
        if (input == 1){
            weightGain();
        } else if (input == 2){
            weightLoss();
        }
    }

    public static void weightGain(){
        System.out.println("In order to gain weight you must be in a calorie surplus");
        System.out.println("These are the details you have entered: ");
        System.out.println("age: " + user_age + " weight: " + user_weight + " height: " + user_height);
    }

    public static void weightLoss(){
        System.out.println("To lose weight, you have to be in a calorie deficit");
    }
}