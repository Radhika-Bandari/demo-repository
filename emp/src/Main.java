import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Branch branch1 = new Branch(101, "CSE");
        Branch branch2 = new Branch(102, "EEE");
        Branch branch3 = new Branch(103, "Mech");
        List<Branch> branches = new ArrayList<>();
        branches.add(branch1);
        branches.add(branch2);
        branches.add(branch3);


        Subject java = new Subject(201,"java",1,101);
        Subject spring = new Subject(202,"spring",2,101);
        Subject circuits = new Subject(203,"circuits",1,102);
        Subject turbines = new Subject(204,"turbines",2,102);
        Subject appliedMechanics = new Subject(205,"Applied mechanics",1,103);
        Subject physics = new Subject(206,"physics",2,103);
        Subject strengthOfMaterials = new Subject(207,"strength of materials",2,103);
        List<Subject> subjects1 = new ArrayList<>();
        subjects1.add(turbines);
        subjects1.add(physics);
        subjects1.add(strengthOfMaterials);
        List<Subject> subjects2 = new ArrayList<>();
        subjects2.add(java);
        subjects2.add(spring);
        List<Subject> subjects3 = new ArrayList<>();
        subjects3.add(circuits);
        List<Subject> subjects4 = new ArrayList<>();
        subjects4.add(appliedMechanics);



        Map<LocalDate,Boolean> attendance = new HashMap<>();
        attendance.put(LocalDate.now(),true);
        List<Staff> staff = new ArrayList<>();
        Staff staff1 = new Staff(301,"Krishna",subjects1,attendance);
        Staff staff2 = new Staff(302,"Radha",subjects2,attendance);
        attendance.put(LocalDate.now(),false);
        Staff staff3 = new Staff(303,"Narayan",subjects3,attendance);
        Staff staff4 = new Staff(304,"Keshav",subjects4,attendance);
        staff.add(staff1);
        staff.add(staff2);
        staff.add(staff3);
        staff.add(staff4);


        Map<Subject,Integer> marks1 = new HashMap<>();
        marks1.put(java,56);
        marks1.put(spring,63);
        Map<Subject,Integer> marks2 = new HashMap<>();
        marks2.put(circuits,26);
        marks2.put(turbines,36);
        Map<Subject,Integer> marks3 = new HashMap<>();
        marks3.put(appliedMechanics,84);
        marks3.put(physics,46);
        Map<Subject,Integer> marks4 = new HashMap<>();
        marks4.put(java,84);
        marks4.put(spring,76);
        Map<Subject,Integer> marks5 = new HashMap<>();
        marks5.put(turbines,64);
        Map<Subject,Integer> marks6 = new HashMap<>();
        marks6.put(strengthOfMaterials,56);
        marks6.put(physics,33);




        attendance.put(LocalDate.now(),true);
        Student stud1 = new Student(11,"Srinivas","srinivas11@gmail.com",1,"CSE",marks1,attendance);
        Student stud2 = new Student(12,"Bhargavi","bhargavi12@gmail.com",2,"EEE",marks2,attendance);
        Student stud3 = new Student(13,"Shiva","shiva13@gmail.com",2,"MECH",marks3,attendance);
        Student stud4 = new Student(14,"Vrinda","vrinda14@gmail.com",1,"CSE",marks4,attendance);
        attendance.put(LocalDate.now(),false);
        Student stud5 = new Student(15,"Madhav","madhav15@gmail.com",2,"EEE",marks5,attendance);
        Student stud6 = new Student(16,"Durga","durga16@gmail.com",2,"CSE",marks6,attendance);
        System.out.println(stud4.attendance);
        System.out.println(stud4.attendance.put(LocalDate.now(),true));
        List<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);
        students.add(stud6);


        System.out.println(" Retrieve student details in year 1");
        List<Student> studentList = students.stream().filter(stud->stud.year == 1).collect(Collectors.toList());
        System.out.println(studentList);


        System.out.println(" Retrieve staff details who teach year 1");
        List<Staff> staffList = staff.stream().filter(staf->staf.getSubjects().stream().anyMatch(sub->sub.getYear() == 1)).collect(Collectors.toList());
        System.out.println(staffList);


        System.out.println(" Retrieve student who is present today in year 1 and branch CSE");
        List<Student> studentList1 = students.stream().filter(stud->stud.year == 1 && stud.branch.equals("CSE") && stud.attendance.put(LocalDate.now(),true)).collect(Collectors.toList());
        System.out.println(studentList1);


        System.out.println(" Retrieve staff who is present today and who teaches Subject1");
        List<Staff> staffList1 = staff.stream().filter(staffs->staffs.getSubjects().equals(subjects1) && staffs.attendance.put(LocalDate.now(),true)).collect(Collectors.toList());
        System.out.println(staffList1);


        System.out.println(" Retrieve students who are not passed in year 1");
        List<Student> studentList2 = students.stream().filter(stud-> stud.year == 1 && stud.marks.values().stream().anyMatch(mark->mark<35)).collect(Collectors.toList());
        System.out.println(studentList2);


        System.out.println("Retrieve staff who teaches more than 2 subjects in year 2");
        List<Staff> staffList2 = staff.stream().filter(staf->staf.getSubjects().stream().filter(sub->sub.getYear() == 2).count()>2).collect(Collectors.toList());
        System.out.println(staffList2);
    }
}