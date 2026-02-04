
import enums.*;

public class User extends Login {

    private int user_id;
    private Department department;
    private String user_name;
    private Gender user_gender;
    private String user_email;
    private RoleUser user_role;

    public User(int id, String username, String password, String name,
            Gender gender, String email, RoleUser role, Department dept) {
        super(username, password);
        this.user_id = id;
        this.user_name = name;
        this.user_gender = gender;
        this.user_email = email;
        this.user_role = role;
        this.department = dept;
        System.err.println("Create User: " + user_name + " with role: " + user_role);
    }

    public void userLogin(String u, String p) {
        System.out.println(loginStatus(u, p) ? "Login Success" : "Login Failed");
    }

    public Proposal addProposal(String code, String title, String text, Applicant app) {
        return new Proposal(code, title, text, app);
    }

    public void confirmProposal(Proposal p, StatusProposal status) {
        if (user_role == RoleUser.Manager) {
            p.changeStatus(status);
        }
    }

    public Report createReports(int code, Proposal p) {
        return new Report(code, p);
    }
}
