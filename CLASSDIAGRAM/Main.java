import enums.*;

public class Main {
    public static void main(String[] args) {

        Department dept = new Department(1, "IT");
        User manager = new User(
                1, "admin", "1234", "Mr.Manager",
                Gender.Male, "admin@email.com",
                RoleUser.Manager, dept
        );

        Applicant app = new Applicant(
                101, "John Doe", "Engineer",
                "Bangkok", Gender.Male, "0899999999"
        );

        Proposal proposal = manager.addProposal(
                "P001", "New System", "Create new system", app
        );

        manager.confirmProposal(proposal, StatusProposal.Accepted);

        Report report = manager.createReports(1, proposal);
        report.viewReports();
    }
}
