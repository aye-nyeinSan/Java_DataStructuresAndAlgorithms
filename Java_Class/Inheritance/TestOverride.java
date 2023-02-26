public class TestOverride {
    public static void main(String[] args) {
        Person p1=new Person("Peter");
        Student s1=new Student("Susan");
        Employee e1=new Employee("Eva");
        Faculty f1=new Faculty("Frank");
        Staff stf1=new Staff("Shane");

        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(e1.toString());
        System.out.println(f1.toString());
        System.out.println(stf1.toString());
    }
}
