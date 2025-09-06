class Student {
    String name;
    int age;

    // Default constructor (added automatically if not written)
    Student() {
        System.out.println("Default constructor called!");
        name = "Unknown";
        age = 0;
    }
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();   // constructor called
        System.out.println(s1.name + " " + s1.age);
    }
}
