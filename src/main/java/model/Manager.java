package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    private List<Employee> teamMembers;

    public Manager(int id, String firstName, String lastName, Sex sex, BigDecimal salary) {
        super(id, firstName, lastName, sex, salary);
        teamMembers = new ArrayList<>();
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    public void addTeamMember(Employee employee) {
        employee.manager = this;
        this.teamMembers.add(employee);
    }
}
