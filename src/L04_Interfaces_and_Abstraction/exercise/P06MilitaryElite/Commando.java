package L04_Interfaces_and_Abstraction.exercise.P06MilitaryElite;

import java.util.Collection;

public interface Commando extends SpecialisedSoldier{
    void addMission(Mission mission);
    Collection<Mission> getMissions();
}
