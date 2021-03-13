import java.util.LinkedList;
import java.util.List;

public class Pokemon
{
    // ....................................................Variables...............................................................
    
    private String name;
    private int number;
    private String type1;
    private String type2;
    private List<String> evolutionLine;

    // ....................................................Constructors...............................................................

    // Empty Constructor
    public Pokemon()
    {

    }

    // 3/5 Attributes Constructor
    public Pokemon(String name, int number, String type1)
    {
        this.name = name;
        this.number = number;
        this.type1 = type1;
    }

    // All Attributes Constructor
    public Pokemon(String name, int number, String type1, String type2, List<String> evolutionLine)
    {
        this.name = name;
        this.number = number;
        this.type1 = type1;
        this.type2 = type2;
        // Copies the items in evolutionLine so if this.evolutionLine is modified, it won't modify the original copy passed in.
        this.evolutionLine = new LinkedList<String>(evolutionLine);
    }

    // ....................................................Get Methods...............................................................
    
    public String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }

    public String getType1()
    {
        return type1;
    }

    public String getType2()
    {
        return type2;
    }

    public List<String> getEvolutionLine()
    {
        return evolutionLine;
    }

    // ....................................................Set Methods...............................................................
    
    public void changeName(String name)
    {
        this.name = name;
    }

    public void changeNumber(int number)
    {
        this.number = number;
    }

    public void changeType1(String type1)
    {
        this.type1 = type1;
    }

    public void changeType2(String type2)
    {
        this.type2 = type2;
    }

    public void changeEvolutionLine(List<String> evolutionLine)
    {
        this.evolutionLine = evolutionLine;
    }

    // ....................................................Methods...............................................................

    // ifEvolves() - Returns boolean
    // Checks to see if the Pokemon has an evolution
    // If the evolutionLine list is not empty, it evolves
    // Else, it is empty and has no evolutions
    boolean ifEvolves()
    {
        if(!evolutionLine.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // isLegendary(name) - Returns String
    // Tests to see if a Pokemon is legendary by their name
    // Will return either "Legendary" or "Non-legendary"
    String isLegendary(String name)
    {
        String[] legendaryList = { "Articuno", "Zapdos", "Moltres", "Mewtwo", "Mew" };
        String legendary = "* * Legendary * *";
        String notLegendary = "Non-legendary";

        for(int i = 0; i < legendaryList.length; i++)
        {

            if(name.equals(legendaryList[i]))
            {
                return legendary;
            }
        }
        
        return notLegendary;
    }

}
