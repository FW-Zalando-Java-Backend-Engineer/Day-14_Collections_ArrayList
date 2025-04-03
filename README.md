# **📘 Day-14: Java Collections – ArrayList**  
Welcome to **Day-14** of our Java learning journey! Today, we focused on one of the most useful and commonly used data structures in Java: the **`ArrayList`**, a part of the **Java Collections Framework (JCF)**.

---

## **📌 Lesson Structure**

### **1️⃣ Introduction to Java Collections Framework (JCF)**
- A set of **interfaces and classes** for managing groups of objects.
- Introduced to overcome the **limitations of arrays** (fixed size, limited functionality).
- Encourages the use of **dynamic, type-safe, reusable data structures**.

### **2️⃣ What is an ArrayList?**
- A **resizable array** implementation of the `List` interface.
- Allows **duplicate elements**, **maintains insertion order**, and provides **indexed access**.
- Part of `java.util` package.

---

## **🧠 Key Features of ArrayList**

| Feature                    | Description                              |
|----------------------------|------------------------------------------|
| ✅ Dynamic Sizing           | Automatically resizes as elements are added. |
| 🔢 Indexed Access          | Fast access via index: `get(int index)` is O(1). |
| ➕ Allows Duplicates       | Yes                                      |
| ⚠️ Slower Insertion/Removal | Especially in the middle/start – O(n).     |
| 📈 Default Capacity        | 10 elements (internally managed).        |

---

## **🧪 Live Coding Demo: Favorite Foods Tracker**

```java
import java.util.ArrayList;
import java.util.Scanner;

public class FavoriteFoodsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> favoriteFoods = new ArrayList<>();
        boolean running = true;

        System.out.println("🍽️ Welcome to the Favorite Foods Tracker!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a food");
            System.out.println("2. Remove a food");
            System.out.println("3. View favorite foods");
            System.out.println("4. Exit");
            System.out.print("👉 Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter food to add: ");
                    String newFood = scanner.nextLine();
                    favoriteFoods.add(newFood);
                    System.out.println(newFood + " added to your favorites!");
                    break;
                case 2:
                    System.out.print("Enter food to remove: ");
                    String removeFood = scanner.nextLine();
                    if (favoriteFoods.remove(removeFood)) {
                        System.out.println(removeFood + " removed.");
                    } else {
                        System.out.println(removeFood + " not found.");
                    }
                    break;
                case 3:
                    if (favoriteFoods.isEmpty()) {
                        System.out.println("Your list is empty!");
                    } else {
                        System.out.println("🍕 Your Favorite Foods:");
                        for (int i = 0; i < favoriteFoods.size(); i++) {
                            System.out.println((i + 1) + ". " + favoriteFoods.get(i));
                        }
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("👋 Goodbye! Stay hungry!");
                    break;
                default:
                    System.out.println("❌ Invalid choice.");
            }
        }

        scanner.close();
    }
}
```

---

## **🎯 Hands-on Assignment**
👨‍💻 **Assignment: Movie Watchlist App using ArrayList**  
You’ll create a dynamic Java console app where users can:
- Add movie titles
- Remove watched ones
- View the current list
- Count how many are left

**👉 [Assignment Link on GitHub Classroom](_to be added_)**

---

## **📚 Additional Resources**
- [ArrayList – Oracle Docs](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- [ArrayList vs LinkedList – GeeksForGeeks](https://www.geeksforgeeks.org/arraylist-vs-linkedlist-java/)
- [Java Collections Overview](https://docs.oracle.com/javase/tutorial/collections/intro/index.html)
- [Video Recording](_to be added_)
- [Lesson Live coding](https://github.com/FW-Zalando-Java-Backend-Engineer/Day-14_Collections/tree/main/Day_14)


---

🚀 **Awesome work today! Mastering ArrayList gives you a real edge in writing clean, efficient Java code.**  
Tomorrow, we’ll dive into `LinkedList` and compare the two like pros! 💪

