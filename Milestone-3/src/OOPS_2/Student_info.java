package OOPS_2;
 class person {
    String name;
    int weight;
}
class Student extends person{
    int roll_number;
    String school_name;
    void print()
    {
        System.out.print(roll_number+" "+name+" "+weight);
    }
}
public class Student_info {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="ayush";
        s.roll_number=10;
        s.weight=65;
        s.school_name="Vijaya Sr. Sec. School";
        s.print();
    }
}