
public class TestEncapsulation
{
    public static void main (String[] args)
    {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Kubison");
        obj.setAge(20);
        obj.setRoll(53);

        // Displaying values of the variables
        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll: " + obj.getRoll());

        // Direct access of studentsroll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " + obj.studentroll);
    }
}

