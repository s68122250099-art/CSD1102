
public class Department {

    private int department_id;
    private String department_name;

    public Department(int department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
        System.err.println("Create Department: " + department_name);
    }

    public void insertDepartment() {
        System.out.println("Insert Department: " + department_name);
    }

    public void updateDepartment(String newName) {
        this.department_name = newName;
        System.out.println("Update Department: " + department_name);
    }

    public void deleteDepartment() {
        System.out.println("Delete Department: " + department_name);
    }
}
