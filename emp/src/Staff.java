import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Staff {
    public int staffId;
    public String email;
    public String staffName;
    public List<Subject> subjects;
    public Map<LocalDate,Boolean> attendance;

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Map<LocalDate, Boolean> getAttendance() {
        return attendance;
    }

    public void setAttendance(Map<LocalDate, Boolean> attendance) {
        this.attendance = attendance;
    }

    public Staff(int staffId, String staffName, List<Subject> subjects, Map<LocalDate, Boolean> attendance) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.subjects = subjects;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", subjects=" + subjects +
                ", attendance=" + attendance +
                '}';
    }
}
