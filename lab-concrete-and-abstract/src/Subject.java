public class Subject {
    private String title;
    private double credits;

    public Subject(String title, double credits)
    {
        this.title = title;
        this.credits = credits;
    }


    public String getTitle() {
        return title;
    }

    public double getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + " | Credits: " + this.credits;
    }


}
