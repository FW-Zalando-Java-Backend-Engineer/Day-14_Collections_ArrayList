import java.util.*;

public class RegistrationSystem {
    public static void main(String[] args) {
        // Step 1: Use a List to store registered usernames
       // Old way: String[] usernames =  new String[3];
       List<String> registeredUsernames = new ArrayList<>();
       // List<Integer> registeredPasswords = new ArrayList<>();

       // Step 2: Add some users :
        registeredUsernames.add("admin");
        registeredUsernames.add("safwan99");
        registeredUsernames.add("x_coder");
        registeredUsernames.add("the_max_dev");

        // Step 3: Display all users
        System.out.println("Registered Users: " +registeredUsernames);

        // Step 4: check if a user already exists
        String checkUser = "safwan";
        boolean userExists = registeredUsernames.contains(checkUser);
        if (userExists) {
            System.out.println(checkUser+" is already registered.");
        }else{
            System.out.println(checkUser+" is not registered.");
        }

        // Step 5: Remove a user who cancelled
        // registeredUsernames.remove(1); index
        registeredUsernames.remove("safwan99"); // object

        //  // Final Step: Display updated list
        System.out.println("Updated Users: " +registeredUsernames);
    }
}
