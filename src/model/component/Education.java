package model.component;

import model.basic.Date;

public class Education {
    private String institution;
    private String department;
    private String specialization;
    private Date fromDate;
    private Date toDate;

    public Education(String institution, String department, String specialization) {
        this.institution = institution;
        this.department = department;
        this.specialization = specialization;
    }

    public String getInstitution() {
        return institution;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return fromDate +
                " - " + toDate +
                " studying " + specialization +
                " at " + institution + " institution, " +
                department + " department ";
    }
}
