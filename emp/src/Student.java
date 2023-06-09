import java.time.LocalDate;
import java.util.Map;

public class Student {
    public int studId;
    public String studName;
    public String studEmail;
    public int year;
    public String branch;
    public Map<Subject,Integer> marks;
    public Map<LocalDate,Boolean> attendance;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudEmail() {
        return studEmail;
    }

    public void setStudEmail(String studEmail) {
        this.studEmail = studEmail;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Map<Subject, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<Subject, Integer> marks) {
        this.marks = marks;
    }

    public Map<LocalDate, Boolean> getAttendance() {
        return attendance;
    }

    public void setAttendance(Map<LocalDate, Boolean> attendance) {
        this.attendance = attendance;
    }

    public Student(int studId, String studName, String studEmail, int year, String branch, Map<Subject, Integer> marks, Map<LocalDate, Boolean> attendance) {
        this.studId = studId;
        this.studName = studName;
        this.studEmail = studEmail;
        this.year = year;
        this.branch = branch;
        this.marks = marks;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studEmail='" + studEmail + '\'' +
                ", year=" + year +
                ", branch='" + branch + '\'' +
                ", marks=" + marks +
                ", attendance=" + attendance +
                '}';
    }
}
