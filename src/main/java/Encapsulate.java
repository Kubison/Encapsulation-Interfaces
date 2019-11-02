public class Encapsulate
{
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String studentname;
    private int studentroll;
    private int studentage;

    // get method for age to access
    // private variable studentage
    public int getAge()
    {
        return studentage;
    }

    // get method for name to access
    // private variable studentname
    public String getName()
    {
        return studentname;
    }

    // get method for roll to access
    // private variable studentroll
    public int getRoll()
    {
        return studentroll;
    }

    // set method for age to access
    // private variable studentage
    public void setAge( int newAge)
    {
        studentage = newAge;
    }

    // set method for name to access
    // private variable studentname
    public void setName(String newName)
    {
        studentname = newName;
    }

    // set method for roll to access
    // private variable studentroll
    public void setRoll( int newRoll)
    {
        studentroll = newRoll;
    }
}

