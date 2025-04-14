package com.Krishan.EmployeeWeb.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long empID;
    private String empName;
    private String empEmail;
    private String empPhone;
    private String empJobTitle;
    private String empImageUrl;
    @Column(updatable = false, nullable = false)
    private String empCode;

    public Employee() {

    }


    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", empJobTitle='" + empJobTitle + '\'' +
                ", empImageUrl='" + empImageUrl + '\'' +
                ", empCode='" + empCode + '\'' +
                '}';
    }

    public Employee(Long empID, String empName, String empEmail, String empPhone, String empJobTitle, String empImageUrl, String empCode) {
        this.empID = empID;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.empJobTitle = empJobTitle;
        this.empImageUrl = empImageUrl;
        this.empCode = empCode;
    }

    public Long getEmpID() {
        return empID;
    }

    public void setEmpID(Long empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpJobTitle() {
        return empJobTitle;
    }

    public void setEmpJobTitle(String empJobTitle) {
        this.empJobTitle = empJobTitle;
    }

    public String getEmpImageUrl() {
        return empImageUrl;
    }

    public void setEmpImageUrl(String empImageUrl) {
        this.empImageUrl = empImageUrl;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }


}
