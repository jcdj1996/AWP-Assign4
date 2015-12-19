package employee;

import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import org.javatuples.Pair;
import util.DB;
import util.Validation;

/**
 * Contains generic employee information
 */
public class Employee {

    Validation v = new Validation();

    // Employee info         
    private String employeeID,
            lastName,
            firstName,
            dateOfBirth,
            gender,
            address,
            apartment,
            city,
            postal,
            province,
            country,
            phone,
            email,
            hireDate,
            department;

    private float salary,
            commission;

    // database queries
    public static final String Q_ALL_EMP_DETAILS = "select * from java_employee",
            Q_ALL_EMP_ID_NAMES = "SELECT empID, fName, lName from java_employee",
            Q_ONE_EMP = "SELECT * FROM java_employee WHERE empID=:id",
            Q_UPDATE_EMP = "UPDATE java_employee set fName=':fName', lName=':lName', dob=':dob', gender=':gender',"
            + " addr=':addr', apt=':apt', postal=':postal', province=':province', country=':country', "
            + "phone=':phone', email=':email', salary=':salary', comm=':comm', dept=':dept' where empID=:id",
            Q_INSERT_Employee = "INSERT java_employee fName=':fName', lName=':lName', dob=':dob', gender=':gender',"
            + " addr=':addr', apt=':apt', postal=':postal', province=':province', country=':country', "
            + "phone=':phone', email=':email', salary=':salary', comm=':comm', dept=':dept'",
            // names type
            FNAME_NAME = "First Name",
            LNAME_NAME = "Last Name",
            DOB_NAME = "Date of Birth",
            GENDER_NAME = "Gender",
            MALE_NAME = "Male",
            FEMALE_NAME = "Female",
            NEUTRAL_NAME = "Neutral",
            ADDR_NAME = "Street Address",
            APT_NAME = "Apartment Number",
            CITY_NAME = "City",
            POSTAL_NAME = "Postal",
            PROVINCE_NAME = "Province",
            COUNTRY_NAME = "Country",
            PHONE_NAME = "Phone",
            EMAIL_NAME = "Email",
            HIRE_NAME = "Hire Date",
            SALARY_NAME = "Salary",
            COMM_NAME = "Commission",
            DEPT_NAME = "Department",
            // external gui components -- ie: the combo box used by the search panel
            EMP_ID_NAMES_NAME = "Employee names";

    // set what validation to perform on each input
    public static final String[] v_Common = new String[]{"nonBlank"};
    public static final HashMap<String, String[]> validations = new HashMap<String, String[]>() {
        {
            put(FNAME_NAME, new String[]{"char"});
            put(LNAME_NAME, new String[]{"char"});
            put(DOB_NAME, new String[]{"date"});         // to be done
            put(GENDER_NAME, new String[]{"char"});
            put(ADDR_NAME, new String[]{"char", "num", "space"});
            put(APT_NAME, new String[]{"num", "nonBlank"});
            put(CITY_NAME, new String[]{"char"});
            put(POSTAL_NAME, new String[]{"postal"});
            put(PROVINCE_NAME, new String[]{"char"});
            put(COUNTRY_NAME, new String[]{"char"});
            put(PHONE_NAME, new String[]{"phone"});
            put(EMAIL_NAME, new String[]{"email"});
            put(HIRE_NAME, new String[]{"date"});
            put(SALARY_NAME, new String[]{"salaryRange"});
            put(COMM_NAME, new String[]{"commissionRange"});
            put(DEPT_NAME, new String[]{"char"});
        }
    };

    public Employee() {
    }

    public Employee(
            String employeeID,
            String firstName,
            String lastName,
            String dateOfBirth,
            String gender,
            String address,
            String aprtmentNo,
            String city,
            String postal,
            String province,
            String country,
            String phone,
            String email,
            String hireDate,
            String salary,
            String commission,
            String department) {
        this.employeeID = employeeID;
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setGender(gender);
        setAddress(address);
        setApartment(aprtmentNo);
        setCity(city);
        setPostal(postal);
        setProvince(province);
        setCountry(country);
        setPhone(phone);
        setEmail(email);
        setHireDate(hireDate);
        setSalary(salary);
        setCommission(commission);
        setDepartment(department);
    }

    /**
     * Passes the component of an action event, plus it's validation criteria,
     * to the appropriate validation.
     *
     * @param e
     * @return String is invalid, empty otherwise
     */
    public Optional<String> validate(FocusEvent e) {

        // get component name
        String name = ((JComponent) e.getSource()).getName();

        // validate text fields
        if (e.getSource().getClass().getTypeName().equals("javax.swing.JTextField")) {
            return v.validateTextField((JTextField) e.getSource(), v_Common, validations.get(name), true);
        }

        return Optional.empty();
    }

    /*
     * Returns a combo box contain an employees id and name

     * @return A combo box of employees
     */
    public static JComboBox getEmpoyeeList() {

        DB localDB = new DB();

        // return empty if result set cannot be loaded
        if (!localDB.loadResultSet(Q_ALL_EMP_ID_NAMES)) {
            return new JComboBox();
        }

        // holds the results of our query
        ArrayList<HashMap<String, String>> queryResults = localDB.getResults();

        // holds the model to populate the combo box
        Vector model = new Vector();

        // populate the model
        for (HashMap<String, String> m : queryResults) {
            model.add(new Pair<String, String>(m.get("empID"), m.get("fName") + " " + m.get("lName")));
        }

        // create, configure and return a new JComboBox
        JComboBox empNameIDBox = new JComboBox(model);
        empNameIDBox.setName(EMP_ID_NAMES_NAME);
        return empNameIDBox;

    }

    /**
     * Saves the details of the employee to the database
     *
     * @return true if save successful
     */
    public boolean save() {

        // existing employees have an id
        if (this.getEmpoyeeID() != null) {
            DB db = new DB();
            // add variables to query
            String query = Q_UPDATE_EMP;
            query = query.replace(":id", getEmpoyeeID());
            query = query.replace(":fName", getFirstName());
            query = query.replace(":lName", getLastName());
            query = query.replace(":dob", getDateOfBirth());
            query = query.replace(":gender", getGender());
            query = query.replace(":addr", getAddress());
            query = query.replace(":apt", getApartmentNo());
            query = query.replace(":city", getCity());
            query = query.replace(":postal", getPostal());
            query = query.replace(":province", getProvince());
            query = query.replace(":country", getCountry());
            query = query.replace(":phone", getPhone());
            query = query.replace(":email", getEmail());
            query = query.replace(":salary", getSalaryAsString());
            query = query.replace(":comm", getCommAsString());
            query = query.replace(":dept", getDepartment());

            System.out.println(db.updateData(query));
    

        }

        // new employees don't have an id
        return true;
    }

    public String getEmpoyeeID() {
        return employeeID;

    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getApartmentNo() {
        return apartment;
    }

    public String getCity() {
        return city;
    }

    public String getPostal() {
        return postal;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getSalaryAsString() {
        return Float.toString(this.salary);
    }

    public String getCommAsString() {
        return Float.toString(commission);
    }

    public String getDepartment() {
        return department;
    }

    public final void setFirstName(String fName) {
        this.firstName = fName;
    }

    public final void setLastName(String lName) {
        this.lastName = lName;
    }

    public final void setDateOfBirth(String dob) {
        this.dateOfBirth = dob;
    }

    public final void setGender(String gender) {
        this.gender = gender;
    }

    public final void setAddress(String addr) {
        this.address = addr;
    }

    public final void setApartment(String apt) {
        this.apartment = apt;
    }

    public final void setCity(String city) {
        this.city = city;
    }

    public final void setPostal(String postal) {
        this.postal = postal;
    }

    public final void setProvince(String province) {
        this.province = province;
    }

    public final void setCountry(String country) {
        this.country = country;
    }

    public final void setPhone(String phone) {
        this.phone = phone;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public final void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public final void setSalary(String salary) {
        this.salary = Float.parseFloat(salary);
    }

    public final void setCommission(String comm) {
        this.commission = Float.parseFloat(comm);
    }

    public final void setDepartment(String department) {
        this.department = department;
    }
}
