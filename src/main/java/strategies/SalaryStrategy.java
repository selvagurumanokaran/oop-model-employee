package strategies;

import model.Developer;

import java.math.BigDecimal;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface SalaryStrategy {

    static SalaryStrategy getDeveloperSalaryStategy(Developer developer,
                                                    Predicate<Developer> additionalSalaryPredicate,
                                                    Supplier<BigDecimal> additionalSalarySupplier) {
        if (additionalSalaryPredicate.test(developer)) {
            return salary -> salary.add(additionalSalarySupplier.get());
        }
        return salary -> salary;
    }

    BigDecimal calculate(BigDecimal salary);
}
