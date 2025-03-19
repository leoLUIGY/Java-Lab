public class Latte extends Coffee{
    private String milkType;
    private String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor)
    {
        super(name, roast, price);

        if(!milkType.equals("whole") && !milkType.equals("skim") &&
                !milkType.equals("almond") && !milkType.equals("oat")) {
            throw new IllegalArgumentException("select a valid milk type");
        }
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;

    }


    public void printLatteDetails() {
        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");
    }
}
