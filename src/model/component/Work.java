package model.component;

import model.basic.Date;

public class Work {
    private String company;
    private String position;
    private Date fromDate;
    private Date toDate;

    public Work(String company, String position) {
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
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
                " " + company.toUpperCase() +
                ", work as " + position;
    }
}
