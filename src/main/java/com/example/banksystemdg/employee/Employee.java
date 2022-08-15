package com.example.banksystemdg.employee;

import com.example.banksystemdg.branch.Branch;

import javax.persistence.*;

@Entity
@Table(name="empolyee")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "emp_id")
        Integer emp_id ;

        @Column(name = "first_name")
        String first_name ;

        @Column(name = "last_name")
        String last_name ;

        @Column(name = "email")
        String email ;

        @Column(name = "password")
        String password ;

        @Column(name = "phone1")
        String phone1 ;

        @Column(name = "phone2")
        String phone2 ;

        @Column(name = "nationalID")
        String nationalID ;

        @Column(name = "gender")
        String gender ;

        @Column(name = "dateofstart")
        String dateofstart ;

        @Column(name = "maritalstatus")
        String maritalstatus ;

    @Column(name = "housenum")
    String housenum ;

    @Column(name = "streetname")
        String streetname ;


        @Column(name = "city")
        String city ;


        @Column(name = "postalcode")
        String postalcode ;

        @Column(name = "type")
        String type ;

//
//        @Column(name = "branchid")
//        String branchid ;

        @Column(name = "salary")
        String salary ;


    //one to one relation ,(employee - branch ), employee as one
    @ManyToOne(targetEntity = Branch.class  , fetch = FetchType.EAGER)
    @JoinColumn(name = "branchid",nullable = true )
    private Branch Branch;

    public Branch getBranch() {
        return Branch;
    }

    public void setBranch(Branch branch) {
        this.Branch = branch;
    }
    public Employee(){}
//    public Employee(Integer emp_id, String first_name, String last_name, String email, String password, String phone1, String phone2, String nationalID, String gender, String dateofstart, String maritalstatus, String housenum, String streetname, String city, String postalcode, String type, String salary, com.example.banksystemdg.branch.Branch branch) {
//        this.emp_id = emp_id;
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.email = email;
//        this.password = password;
//        this.phone1 = phone1;
//        this.phone2 = phone2;
//        this.nationalID = nationalID;
//        this.gender = gender;
//        this.dateofstart = dateofstart;
//        this.maritalstatus = maritalstatus;
//        this.housenum = housenum;
//        this.streetname = streetname;
//        this.city = city;
//        this.postalcode = postalcode;
//        this.type = type;
////        this.branchid = branchid;
//        this.salary = salary;
//        Branch = branch;
//    }
//    public Branch getBranch() {
//        return Branch;
//    }
//
//    public void setBranch(Branch branch) {
//        this.Branch = branch;
//    }
    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateofstart() {
        return dateofstart;
    }

    public void setDateofstart(String dateofstart) {
        this.dateofstart = dateofstart;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getHousenum() {
        return housenum;
    }

    public void setHousenum(String housenum) {
        this.housenum = housenum;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public String getbranchid() {
//        return branchid;
//    }
//
//    public void setbranchid(String branchid) {
//        this.branchid = branchid;
//    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", nationalID='" + nationalID + '\'' +
                ", gender='" + gender + '\'' +
                ", dateofstart='" + dateofstart + '\'' +
                ", maritalstatus='" + maritalstatus + '\'' +
                ", housenum='" + housenum + '\'' +
                ", streetname='" + streetname + '\'' +
                ", city='" + city + '\'' +
                ", postalcode='" + postalcode + '\'' +
                ", type='" + type + '\'' +
//                ", branchid='" + branchid + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
