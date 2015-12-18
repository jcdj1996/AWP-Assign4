package employee;

import java.util.Optional;
import salesapp.MainGUI;

/**
 *  Contains generic employee information
 */
public class Employee {
    
    // personal info
    private String lName;
    private String fName;
    private String dob;
    private String gender;
    
    // address
    private String addr;
    private String apt;
    private String city;
    private String postal;
    private String province;
    private String country;
    
    // contact
    private String phone;
    private String email;
    
    // employee info
    private String hireDate;
    private String payType;
    private float  salary;
    private float  comm; 
    private String position;
    private String department;
    
    public Employee() {
    }
    
    public Employee(
            String fName,
            String lName,
            String dob,
            String gender,
            String addr,
            String apt,
            String city,
            String postal,
            String province,
            String country,
            String phone,
            String email,
            String hireDate,
            String payType,
            String salary,
            String comm,
            String position,
            String department)
    {
        setfName(fName);
        setlName(lName);
        setDob(dob);
        setGender(gender);
        setAddr(addr);
        setApt(apt);
        setCity(city);
        setPostal(postal);
        setProvince(province);
        setCountry(country);
        setPhone(phone);
        setEmail(email);
        setHireDate(hireDate);
        setPayType(payType);
        setSalary(salary);
        setComm(comm);
        setPosition(position);
        setDepartment(department);
    }
    
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        System.out.println("setting last name");
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        System.out.println("setting first name");
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        System.out.println("setting dob");
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        System.out.println("setting gender");
        this.gender = gender;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        System.out.println("setting adds");
        this.addr = addr;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        System.out.println("setting apt");
        this.apt = apt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("set city");
        this.city = city;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        System.out.println("set postal");
        this.postal = postal;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        System.out.println("set province");
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        System.out.println("set country");
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        System.out.println("set phone");
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("set email");
        this.email = email;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        System.out.println("set hire date");
        this.hireDate = hireDate;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        System.out.println("set pay type");
        this.payType = payType;
    }

    public String getSalaryAsString() {
        return "3.4";
    }
    
    public void setSalary(String salary) {
        System.out.println("set salary");
        this.salary = 3.4f;
    }
    
    public String getCommAsString() {
        return "3.4";
    }
    
    public void setComm(String comm) {
        System.out.println("set comm");
        this.comm = 3.4f;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        System.out.println("set position");
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    // personal info
    public void setDepartment(String department) {
        System.out.println("set dept");
        this.department = department;
    }
    
    public void saveEmployee() {
        System.out.println("saving employee");
    }
    
}
