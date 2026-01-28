import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordStrength {


    public static boolean minimumLength(String password) {
        return password.length() >= 8;
    }

    public static boolean hasSpecialCharacter(String password) {
        List<Character> specialCharacters = List.of('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+');
        for(int i=0;i<password.length();i++){
            if(specialCharacters.contains(password.charAt(i))){
                return true;
            }
        }

        return false;
    }

    public static boolean hasDigit(String password) {
        for(int i=0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }




    
    public static String validate_password(String pwd){
        if (minimumLength(pwd) && hasSpecialCharacter(pwd) && hasDigit(pwd)) {
            return "pass";
        }else{
            return "fail";
        }
    }
    





    public static void main(String[] args) {
        String password = new String();
        int numberOfPasswords;
        

        List<String> passwordList =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of passwords to check:");
        numberOfPasswords = sc.nextInt();
        sc.nextLine(); 
        String[][] results = new String[numberOfPasswords][2];

        for(int i=0;i<numberOfPasswords;i++){
            System.out.println("Enter " + (i+1) + "th  password:");
            password = sc.nextLine();
            passwordList.add(password);
        }


        for(int i=0;i<passwordList.size();i++){
            password = passwordList.get(i);
            results[i][0] = password;
            results[i][1] = validate_password(password);
        }

        System.out.println("Password Strength Results:");
        System.out.printf("%-20s %-10s%n","Password","Result");

        for(int i=0;i<results.length;i++){
            System.out.printf("%-20s %-10s%n",results[i][0],results[i][1]);
        }


    }
}
