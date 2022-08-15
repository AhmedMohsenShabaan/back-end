package com.example.banksystemdg.customer;

import javax.persistence.*;


//import com.crudDemo.CrudDemo.dto.CustomerDTO;
import com.example.banksystemdg.account.Account;
import com.example.banksystemdg.branch.Branch;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "cust_id")
    private int cust_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "mid_name")
    private String mid_name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone1")
    private int phone1;

    @Column(name = "phone2")
    private int phone2;

    @Column(name = "nationalID")
    private String nationalID;

    @Column(name = "gender")
    private String gender;

    @Column(name = "dateofbirth")
    private String date_birth;

    @Column(name = "maritalstatus")
    private String maritalStatus;

    @Column(name = "housenum")
    private Integer houseNum;

    @Column(name = "streetname")
    private String streetName;

    @Column(name = "city")
    private String city;

    @Column(name = "postalcode")
    private Integer postalcode;

    @Column(name = "type")
    private String type;

    @Column(name = "income")
    private Integer income;

@ManyToOne(targetEntity = Branch.class  , fetch = FetchType.EAGER)
@JoinColumn(name = "branchid",nullable = true )
private Branch Branch;

    public Branch getBranch() {
        return Branch;
    }

    public void setBranch(Branch branch) {
        this.Branch = branch;
    }

//    @OneToMany(mappedBy = "customer",cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//            CascadeType.DETACH, CascadeType.REFRESH})
//    @JoinColumn(name = "custID" , referencedColumnName="cust_id" ,insertable = false , updatable = false)
//    private List<Account> accounts;

//    @Column(name = "branchid")
//    private Integer branchid;

//    public Integer getBranchid() {
//        return branchid;
//    }
//
//    public void setBranchid(Integer branchid) {
//        this.branchid = branchid;
//    }

    public Customer() {
    }

    public Customer(int id, String firstName, String mid_name, String lastName, String email, int phone1, int phone2, String nationalID, String gender, String date_birth, String maritalStatus, int houseNum, String streetName, String city, int postalcode, Branch branch, String type, int income) {
        this.cust_id = id;
        this.firstName = firstName;
        this.mid_name = mid_name;
        this.lastName = lastName;
        this.email = email;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.nationalID = nationalID;
        this.gender = gender;
        this.date_birth = date_birth;
        this.maritalStatus = maritalStatus;
        this.houseNum = houseNum;
        this.streetName = streetName;
        this.city = city;
        this.postalcode = postalcode;
        this.type = type;
        this.income = income;
    }
//    public Customer(CustomerDTO cust) {
//        this.cust_id = cust.getId();
//        this.firstName = cust.getFirstName();
//        this.mid_name = cust.getMid_name();
//        this.lastName = cust.getLastName();
//        this.email = cust.getEmail();
//        this.phone1 = cust.getPhone1();
//        this.phone2 = cust.getPhone2();
//        this.nationalID = cust.getNationalID();
//        this.gender = cust.getGender();
//        this.date_birth = cust.getDate_birth();
//        this.maritalStatus = cust.getMaritalStatus();
//        this.houseNum = cust.getHouseNum();
//        this.streetName = cust.getStreetName();
//        this.city = cust.getCity();
//        this.postalcode = cust.getPostalcode();
//        this.branch = cust.getBranch();
//        this.type = cust.getType();
//        this.income = cust.getIncome();
//    }
//    public void addAccount(Account temp){
//        if(accounts == null)
//            accounts = new ArrayList<>();
//
//        accounts.add(temp);
//        temp.setCustomer(this);
//
//    }
    public int getId() {
        return cust_id;
    }

    public void setId(int id) {
        this.cust_id = id;
    }

//    public List<Account> getAccounts() {
//        return accounts;
//    }

//    public void setAccounts(List<Account> accounts) {
//        this.accounts = accounts;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(String date_birth) {
        this.date_birth = date_birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMid_name() {
        return mid_name;
    }

    public void setMid_name(String mid_name) {
        this.mid_name = mid_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone1() {
        return phone1;
    }

    public void setPhone1(int phone1) {
        this.phone1 = phone1;
    }

    public int getPhone2() {
        return phone2;
    }

    public void setPhone2(int phone2) {
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


    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }




    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", firstName='" + firstName + '\'' +
                ", mid_name='" + mid_name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone1=" + phone1 +
                ", phone2=" + phone2 +
                ", nationalID=" + nationalID +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", houseNum=" + houseNum +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", postalcode=" + postalcode +
//                ", branch=" + Branch +
                ", income=" + income +
                '}';
    }
}
