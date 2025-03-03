//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Student{
    static int RollNo;
}



public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("First step");
        System.out.println("Added to git");

        Student s1 = new Student();
        Student s2 =  new Student();
        s1.RollNo =  10;
        Student.RollNo = 20;

        System.out.println("The roll no "+s1.RollNo);

        InstanceVariable data = new InstanceVariable();

        System.out.println(data.a);
    }
}