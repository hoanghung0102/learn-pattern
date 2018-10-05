package hoanghung.com.demo.entity;

import hoanghung.com.demo.buiderclass.EmployeeBuilder;
import lombok.Data;

@Data
public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.getId();
        this.firstName = employeeBuilder.getFirstName();
        this.lastName = employeeBuilder.getLastName();
        this.age = employeeBuilder.getAge();
        this.phone = employeeBuilder.getPhone();
        this.address = employeeBuilder.getAddress();
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String args[]) {
        Employee emp = new EmployeeBuilder(1L, "Hoang", "Hoang")
                .age(17)
                .phone("0935111953")
                .address("And Hai Bac, Son Tra, Da Nang")
                .build();

        System.out.println(emp);
    }
}
