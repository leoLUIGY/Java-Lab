public abstract class Course {
    private Subject subject;
    private String instructor;
    private int totalActivities;
    private int totalQuiz;

    public Course(Subject subject, String instructure){
        this.subject = subject;
        this.instructor = instructure;
    }

    public Subject getSubject() {
        return subject;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getTotalActivities() {
        return totalActivities;
    }

    public void setTotalActivities(int totalActivities) {
        this.totalActivities = totalActivities;
    }

    public int getTotalQuiz() {
        return totalQuiz;
    }

    public void setTotalQuiz(int totalQuiz) {
        this.totalQuiz = totalQuiz;
    }
}
