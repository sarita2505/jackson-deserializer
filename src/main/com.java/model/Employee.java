package model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using=EmpJacksonDeserializer.class, as = Employee.class)
public class Employee {
    private String empName;
    private  Integer empId;
    private Address address;

    public Employee() {
    }

    public Employee(String empName, Integer empId, Address address) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", address=" + address +
                '}';
    }
}
