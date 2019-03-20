package com.ShaBris.AcademyFile;

public class StudentBase {
    private String studentLastName;
    private String studentFirstName;
    private String studentBirthDate;
    private String gender;
    private String alias;
    private String partnerType;

    public StudentBase(String studentLastName, String studentFirstName, String studentBirthDate, String gender, String alias, String partnerType) {
        this.studentLastName = studentLastName;
        this.studentFirstName = studentFirstName;
        this.studentBirthDate = studentBirthDate;
        this.gender = gender;
        this.alias = alias;
        this.partnerType = partnerType;
    }

    public StudentBase(String gender, String partnerType) {
        this.gender = gender;
        this.partnerType = partnerType;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(String studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }
}
