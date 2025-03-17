public class ClassroomCourse extends Course{
    private String school;
    private String session;
    public ClassroomCourse(Subject subject, String instructure, String school, String session) {
        super(subject, instructure);
        this.school = school;
        this.session = session;
    }
}
