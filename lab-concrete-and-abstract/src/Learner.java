public class Learner implements Assessments{
    String name;
    Course course;
    double gradeScore;

    public Learner(String name, Course course){
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " | Course: " + this.course.getSubject().getTitle();
    }

    @Override
    public void assignmentActivities(int marks) {
        this.course.setTotalActivities(marks);
    }

    @Override
    public void quizScore(int marks) {
        this.course.setTotalQuiz(marks);
    }

    public double calculateGrade()
    {
        int maxActivities = 100, maxQuiz = 30;
        if(this.course.getSubject().getTitle().contains("Online")){
            maxActivities = 30;
            maxQuiz = 10;
        }

        double assignementGrade = (double)this.course.getTotalActivities()*10/maxActivities;
        double quizGrade = (double)this.course.getTotalQuiz()*10/maxQuiz;
        this.gradeScore = (assignementGrade  + quizGrade)/2;
        return this.gradeScore;

    }
}
