
import enums.Gender;

public class Applicant {

    private int applicant_id;
    private String applicant_name;
    private String applicant_job;
    private String applicant_address;
    private Gender applicant_gender;
    private String applicant_tel;

    public Applicant(int id, String name, String job, String address, Gender gender, String tel) {
        this.applicant_id = id;
        this.applicant_name = name;
        this.applicant_job = job;
        this.applicant_address = address;
        this.applicant_gender = gender;
        this.applicant_tel = tel;
        System.err.println("Create Applicant: " + applicant_name + " with gender: " + applicant_gender);
    }

    public void insertApplicant() {
        System.out.println("Insert Applicant: " + applicant_name);
    }

    public void updateApplicant() {
        System.out.println("Update Applicant: " + applicant_name);
    }

    public void deleteApplicant() {
        System.out.println("Delete Applicant: " + applicant_name);
    }
}
