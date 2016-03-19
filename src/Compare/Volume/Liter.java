package Compare.Volume;

import java.util.HashMap;

public class Liter implements Volume {
    private double value;

    public Liter(double value) {
        this.value = value;
    }
    private Volume getScaleFor(Class className){
        HashMap<Class ,Volume> Volumes =  new HashMap<Class , Volume>();
        Volumes.put(Gallon.class , new Gallon(value/3.78));
        return  Volumes.get(className);
    }
    @Override
    public Volume convertTo(Volume other) {
        return getScaleFor(other.getClass());
    }

    @Override
    public double getValue() {
        return value;
    }

}

