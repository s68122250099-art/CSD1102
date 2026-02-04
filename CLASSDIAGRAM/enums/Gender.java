package enums;

public enum Gender {
    Male("M"),
    Female("F");

    private final String gender;

    private Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    
}
