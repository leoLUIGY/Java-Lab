import com.sun.jdi.InvalidTypeException;

public class Coffee {
    protected String name;
    protected String roast;
    protected int caffeineLevelInMg;
    protected double price;


    public Coffee(String name, String roast, double price)
    {
        this.name = name;
        this.roast = roast;
        this.price = price;

        try
        {
            setCaffeineLevel();
        }catch (InvalidTypeException e)
        {
            System.out.println(e.getMessage());
            caffeineLevelInMg = 50;
        }
    }

    public void setCaffeineLevel() throws InvalidTypeException
    {
        if(roast.equals("light"))
        {
            caffeineLevelInMg = 50;
        }else if(roast.equals("medium"))
        {
            caffeineLevelInMg = 100;
        }else if(roast.equals("dark"))
        {
            caffeineLevelInMg = 150;
        }else {
            throw new InvalidTypeException("write on of the existing options!");
        }
    }

    public void grindBeans()
    {
        System.out.println("\nGrinding beans for " + name + "...");
    }

    public void brewCoffee()
    {
        System.out.println("\nBrewing your favorite " + name + "...");
    }

    public void printInfo()
    {
        System.out.println("\nYou ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + caffeineLevelInMg + " mg.");
    }

}
