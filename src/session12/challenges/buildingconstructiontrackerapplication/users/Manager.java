package session12.challenges.buildingconstructiontrackerapplication.users;

import java.util.ArrayList;
import java.util.List;

public class Manager{

    private String name;
    private ConstructionEngineer teamLead;
    private List<ConstructionEngineer> members;

    public Manager(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addEngineer(ConstructionEngineer engineer){
        members.add(engineer);
    }

    public void removeEngineer(ConstructionEngineer engineer){
        members.remove(engineer);
    }

    public void setTeamLead(ConstructionEngineer teamLead){
        this.teamLead = teamLead;
    }





}
