package session12.challenges.buildingconstructiontrackerapplication.users;

import java.util.ArrayList;
import java.util.List;

public abstract class User implements Administrator{

    private Manager manager;


    private List<Manager> managers;
    private List<ConstructionEngineer> constructionEngineers;

    protected User(){
        managers = new ArrayList<>();
    }


    @Override
    public void addManager(Manager manager){
        managers.add(manager);
    }


    public List<Manager> getManagers(){
        return managers;
    }

    public List<ConstructionEngineer> getConstructionEngineers(){
        return constructionEngineers;
    }


}
