import java.util.Date;

public class Report {
    private int report_code;
    private Date report_date;
    private Proposal proposal;

    public Report(int code, Proposal proposal) {
        this.report_code = code;
        this.report_date = new Date();
        this.proposal = proposal;
    }

    public void createReports() {
        System.out.println("Create Report for Proposal");
    }

    public void viewReports() {
        System.out.println("Report Code: " + report_code);
    }
}
