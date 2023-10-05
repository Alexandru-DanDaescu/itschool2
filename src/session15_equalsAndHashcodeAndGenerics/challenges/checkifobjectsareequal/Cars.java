package session15_equalsAndHashcodeAndGenerics.challenges.checkifobjectsareequal;

import java.util.ArrayList;
import java.util.List;

public class Cars {



    private List<Lamborghini> lamborghiniList;
    private List<Opel> opelList;

    Cars(){
        this.lamborghiniList = new ArrayList<>();
        this.opelList = new ArrayList<>();

    }


    public void addLamborghini(Lamborghini lamborghini){
        lamborghiniList.add(lamborghini);
    }

    public void addOpel(Opel opel){
        opelList.add(opel);
    }

    public List<Lamborghini> getLamborghiniList() {
        return lamborghiniList;
    }

    public void setLamborghiniList(List<Lamborghini> lamborghiniList) {
        this.lamborghiniList = lamborghiniList;
    }

    public List<Opel> getOpelList() {
        return opelList;
    }

    public void setOpelList(List<Opel> opelList) {
        this.opelList = opelList;
    }




}
