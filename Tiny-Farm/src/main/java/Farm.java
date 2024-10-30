import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<FarmAnimals> animals = new ArrayList<>();

    public void add(FarmAnimals a){
        animals.add(a);
    }

    public void feedAnimals(){
        for (Animal a : animals){
            a.eat();
        }
    }



}

