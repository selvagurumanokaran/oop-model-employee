import model.Developer;
import model.Manager;
import model.Sex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Manager cathy = new Manager(1, "Cathy", "Doe", Sex.FEMALE, new BigDecimal("1243434.34"));
        List<String> languagesKnown = new ArrayList<>();
        languagesKnown.add("C");
        languagesKnown.add("C++");
        languagesKnown.add("Java");
        Developer selvaguru = new Developer(2, "Selvaguru", "Manokaran", Sex.MALE, new BigDecimal("200"), languagesKnown);

        languagesKnown = new ArrayList<>();
        languagesKnown.add("C");
        languagesKnown.add("RoR");
        Developer ajay = new Developer(3, "Ajay", "Kumar", Sex.MALE, new BigDecimal("200"), languagesKnown);

        cathy.addTeamMember(selvaguru);
        cathy.addTeamMember(ajay);

        System.out.println("Selvaguru's salary " + selvaguru.getSalary());
        System.out.println("Ajay's salary " + ajay.getSalary());

    }
}
