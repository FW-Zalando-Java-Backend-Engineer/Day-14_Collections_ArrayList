# **📘 Day-14: Java Collections – ArrayList & LinkedList**  
Welcome to **Day-14** of our Java learning journey! Today, we dive into one of the most **powerful tools** in Java – the **Collections Framework**, with a deep focus on **List implementations: ArrayList and LinkedList**.

---

## **📌 Lesson Structure**

### **1️⃣ What is Java Collections Framework (JCF)?**
- A **standard architecture** to store and manipulate groups of objects.
- Provides **ready-to-use data structures** such as **List**, **Set**, **Map**, and **Queue**.
- **Key Benefits**:
  - Reduces programming effort.
  - Increases performance and efficiency.
  - Promotes code reusability.

### **2️⃣ Why Use Collections Instead of Arrays?**
- Collections are **dynamic in size**.
- Offer **powerful APIs** for searching, sorting, and manipulating data.
- Arrays are **fixed in size** and lack flexibility and utility methods.

### **3️⃣ Java Collections Interfaces**
- **List** – Ordered, allows duplicates.
- **Set** – No duplicates, unordered.
- **Map** – Key-value pairs, unique keys.
- **Queue** – Follows FIFO principle.

📌 *Today’s focus is on the `List` interface.*

---

## **📂 List Interface Overview**
- An **ordered collection** of elements.
- Elements can be **accessed via index**.
- **Allows duplicates**.
- Common Implementations:
  - `ArrayList`
  - `LinkedList`
  - `Vector` *(legacy)*
  - `Stack` *(legacy)*

---

## **🧱 ArrayList Basics**
- Backed by a **resizable array**.
- Ideal for **random access** (e.g., `get(int index)` is **O(1)**).
- Less efficient for **insertion/removal** in the middle/start (**O(n)**).
- Default initial capacity is **10**, can be manually increased using `ensureCapacity()`.

---

## **🔗 LinkedList Basics**
- Backed by a **doubly-linked list**.
- Efficient at **insertions/removals** at the start/middle (**O(1)** at head).
- Slower for **random access** (e.g., `get(int index)` is **O(n)**).
- Higher memory overhead due to **node objects** (element + prev/next references).

---

## **⚖️ ArrayList vs LinkedList Comparison**

| Operation             | ArrayList      | LinkedList     |
|----------------------|----------------|----------------|
| Random Access         | ✅ O(1)         | ❌ O(n)         |
| Insertion at End      | ✅ O(1)*        | ✅ O(1)         |
| Insertion at Start    | ❌ O(n)         | ✅ O(1)         |
| Memory Overhead       | ✅ Lower        | ❌ Higher       |

> 🧠 *Use ArrayList for fast access, use LinkedList for frequent inserts/deletes!*

---

## **🧪 Live Coding Examples**

### **🖥️ ArrayList Example**
```java
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);
        System.out.println("First Fruit: " + fruits.get(0));

        fruits.remove("Banana");
        System.out.println("After Removal: " + fruits);
    }
}
```

**📝 Expected Output:**
```
Fruits: [Apple, Banana, Mango]
First Fruit: Apple
After Removal: [Apple, Mango]
```

---

### **🖥️ LinkedList Example**
```java
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Berlin");
        cities.addFirst("Amsterdam");
        cities.addLast("Zurich");

        System.out.println("Cities: " + cities);
        cities.removeFirst();
        System.out.println("After removing first: " + cities);
    }
}
```

**📝 Expected Output:**
```
Cities: [Amsterdam, Berlin, Zurich]
After removing first: [Berlin, Zurich]
```

---

## **🎯 Hands-on Exercises**
✅ Create a `List` of your 5 favorite movies using **ArrayList**, print them, then sort them alphabetically.  
✅ Implement a **Queue behavior** (FIFO) using **LinkedList**.  
✅ Try inserting elements at the start, middle, and end of both ArrayList and LinkedList – compare performance.  
✅ Explore the use of `ensureCapacity()` in ArrayList.

---

## **📚 Additional Resources**
- **[Collections Overview – Oracle Docs](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)**
- **[List Interface – Oracle Docs](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)**
- **[ArrayList vs LinkedList – GeeksForGeeks](https://www.geeksforgeeks.org/arraylist-vs-linkedlist-java/)**
- [Video Lesson Recording](_will be added later_)

---

🚀 **Great work reaching Day-14! Collections are the bread and butter of Java devs – and way more fun than debugging PHP 😄**  
Keep practicing and get ready for the next challenge!
