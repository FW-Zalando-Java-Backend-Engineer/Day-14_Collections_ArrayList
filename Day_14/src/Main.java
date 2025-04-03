import java.util.ArrayList;

public class Main {
    // Fields
    public static void main(String[] args) {
        greeting("World");

        // Old way Arrays
        String[] users = { "Alex", "Bob", "Charlie" }; // fixed array, size is 3
        users[0] = null; // removing is this way only , but no way to add new items
        System.out.println(users.length); // 3


        // ArrayList : JCF

        //Step 1:
        ArrayList<String> usersList = new ArrayList<>();
        // WHat happens internally :
        /**
         *  String[] usersList1 = {}; // fixed size is 0
         * */

        //Step 2:
        usersList.add("Alex");
        // WHat happens internally :
        /**
         * * String[] usersList2 = {usersList1 items .. ,"Alex"}  //  fixed size is 1
         * delete usersList1 x
                  *
         * */

        //Step 3:
        usersList.add("Bob");
        // WHat happens internally :
        /**
         * String[] usersList3 = {usersList2 items ... , "Bob"}  //  fixed size is 2
         * delete usersList2 x
         * */

        // Step 4:
        usersList.add("Charlie");
        // WHat happens internally :
        /**
         * String[] usersList4 = {usersList3 items ... , "Charlie"}  //  fixed size is 3
         * delete usersList3 x
         * */

        // Step 5:
        usersList.remove("Bob");
        // What happens internally :
        /**
         * search for the first occurrence  in usersList4: return its index : 1
         * create new array with the new size :
         * String[] usersList5 = new Array(2) // new size of 2 _ fixed
         * adding the old array items without the item to be removed :
         * usersList5[0] = usersList4[0];
         * usersList5[1] = usersList4[2] // we skip index 1 to be removed
         * usersList5 contains only the items after removing "Bob": [ index : 1 ]
         *
         * */



        }

        public static void greeting(String name /*params*/) {
        // variable
        String greeting = "Hello " + name + "!";

            System.out.println(greeting);
        }
    }