package model;

import strategies.SalaryStrategy;

import java.math.BigDecimal;
import java.util.List;

public class Developer extends Employee {
    private List<String> languagesKnown;

    public Developer(int id,
                     String firstName,
                     String lastName,
                     Sex sex,
                     BigDecimal salary,
                     List<String> languagesKnown) {
        super(id, firstName, lastName, sex, salary);
        this.languagesKnown = languagesKnown;
    }

    public List<String> getLanguagesKnown() {
        return languagesKnown;
    }

    public BigDecimal getSalary() {
        SalaryStrategy salaryStrategy = SalaryStrategy.getDeveloperSalaryStategy(this,
                developer -> developer.languagesKnown.contains("C++"), () -> new BigDecimal("100"));
        return super.getSalary(salaryStrategy);
    }
}
