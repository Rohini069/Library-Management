package person;

import java.sql.Date;

public class Student extends Member{
        private String studentId;
        private String course;

    public Student(int memId, Date dateOfMembership, int booksIssued, int maxBookLimit, String name,
                   String address, long phNo, String studentId, String course) {
        super(memId, dateOfMembership, booksIssued, maxBookLimit, name, address, phNo);
        this.studentId = studentId;
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
