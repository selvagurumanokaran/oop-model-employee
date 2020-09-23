package model;

import strategies.SalaryStrategy;

import java.math.BigDecimal;

abstract public class Employee {

    protected Manager manager;
    private int id;
    private String firstName;
    private String lastName;
    private Sex sex;
    private BigDecimal salary;

    public Employee(int id, String firstName, String lastName, Sex sex, BigDecimal salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public BigDecimal getSalary(SalaryStrategy salaryStrategy) {
        return salaryStrategy.calculate(salary);
    }

    public Manager getManager() {
        return manager;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
