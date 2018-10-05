package hoanghung.com.demo.buiderclass;

import hoanghung.com.demo.entity.Employee;
import lombok.Data;

@Data
public class EmployeeBuilder {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    public EmployeeBuilder(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee build() {
        isValidateEmployeeData();

        return new Employee(this);
    }

    public EmployeeBuilder age(int age) {
        this.setAge(age);

        return this;
    }

    public EmployeeBuilder phone(String phone) {
        this.setPhone(phone);

        return this;
    }

    public EmployeeBuilder address(String address) {
        this.setAddress(address);

        return this;
    }

    private boolean isValidateEmployeeData() {
        // Do some basic validations to check
        return true;
    }
}
