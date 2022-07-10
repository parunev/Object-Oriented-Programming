package L04_Interfaces_and_Abstraction.exercise.P06MilitaryElite;

import java.util.Collection;

public interface Engineer extends SpecialisedSoldier {
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
