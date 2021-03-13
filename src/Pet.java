
public class Pet
{
    // Instance Variables
    private String name;
    private int age;
    private String location;
    private String type;

    // Empty Constructor
    public Pet()
    {

    }

    // Constructor - all attributes
    public Pet(String name, int age, String location, String type)
    {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // Get methods
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getType()
    {
        return type;
    }

    // Set methods
    public void changeName(String name)
    {
        this.name = name;
    }

    public void changeAge(int age)
    {
        this.age = age;
    }

    public void changeLocation(String location)
    {
        this.location = location;
    }

}
