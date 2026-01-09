
//คลาส Student
public class Student {

    //ที่มีข้อมูลดังนี้
    //studentId(รหัสนักศึกษา)
    //name (ชื่อ)
    //major(สาขาวิชา)
    //gpa (เกรดเฉลี่ย)
    private String studentId;
    private String name;
    private String major;
    private double gpa;

    //1. สร้าง constructor เพื่อกำหนดค่าข้อมูลทั้งหมด
    public Student(String studentId, String name, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    //2. สร้างเมธอด displayInfo() เพื่อแสดงข้อมูลนักศึกษา
    public void displayInfo() {
        System.out.print("รหัสนักเรียน: " + studentId);
        System.out.print(" ชื่อ: " + name);
        System.out.print(" สาขา: " + major);
        System.out.print(" GPA: " + gpa);
        System.out.println();
    }
}
