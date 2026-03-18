package workshop;

// Question 8: No-argument constructor that prints "User created!"

public class Q08_User {
    // No-argument constructor
    Q08_User() {
        System.out.println("User created!");
    }

    public static void main(String[] args) {
        Q08_User user1 = new Q08_User();
        Q08_User user2 = new Q08_User();
    }
}
