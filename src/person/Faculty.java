package person;

import java.sql.Date;

public class Faculty extends Member{
        private String facultyId;
        private String department;

    public Faculty(int memId, Date dateOfMembership, int booksIssued, int maxBookLimit,
                   String name, String address, long phNo, String facultyId, String department) {
        super(memId, dateOfMembership, booksIssued, maxBookLimit, name, address, phNo);
        this.facultyId = facultyId;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }
}
