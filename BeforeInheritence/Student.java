public class Student {
    int roll;
    String name;
    String fname;
    int age;
    int std;

    public Student () {
        System.out.println("called");
    }

    public Student(String name, int age, int std) {
        this.name = name;
        this.age = age;
        this.std = std;
    } 

    public Student(String fname, int age, int std) {
        this.fname = fname;
        this.age = age;
        this.std = std;
    } 

}