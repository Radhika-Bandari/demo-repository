public class Subject {
    public int subId;
    public String subName;
    public int year;
    public String email;
    public int branchId;

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public Subject(int subId, String subName, int year, int branchId) {
        this.subId = subId;
        this.subName = subName;
        this.year = year;
        this.branchId = branchId;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subId=" + subId +
                ", subName='" + subName + '\'' +
                ", year=" + year +
                ", branchId=" + branchId +
                '}';
    }
}
