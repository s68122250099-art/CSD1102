import enums.StatusProposal;
import java.util.Date;

public class Proposal {
    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal proposal_status;
    private Applicant applicant;

    public Proposal(String code, String title, String text, Applicant applicant) {
        this.proposal_code = code;
        this.proposal_title = title;
        this.proposal_text = text;
        this.proposal_date = new Date();
        this.proposal_status = StatusProposal.Waiting;
        this.applicant = applicant;
        System.err.println("Create Proposal: " + proposal_title + " with status: " + proposal_status);
    }

    public void viewProposal() {
        System.out.println("Proposal: " + proposal_title);
    }

    public void viewStatus() {
        System.out.println("Status: " + proposal_status);
    }

    public void updateProposal(String text) {
        this.proposal_text = text;
    }

    public void deleteProposal() {
        System.out.println("Delete Proposal: " + proposal_code);
    }

    public void archiveProposal() {
        System.out.println("Archive Proposal");
    }

    public void changeStatus(StatusProposal status) {
        this.proposal_status = status;
    }

    public Applicant viewApplicant() {
        return applicant;
    }
}
