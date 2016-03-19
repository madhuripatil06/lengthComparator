package Compare.Volume;

import java.util.HashMap;

public class Gallon implements Volume {
    private double value;

    public Gallon(double value) {
        this.value = value;
    }

    private Volume getScaleFor(Class className){
        HashMap<Class ,Volume> Volumes =  new HashMap<Class , Volume>();
        Volumes.put(Liter.class , new Liter(value*3.78));
        return  Volumes.get(className);
    }

    @Override
    public Volume convertTo(Volume other) {
        return getScaleFor(other.getClass());
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Volume)) return false;

        Volume gallon = ((Volume) o).convertTo(new Gallon(0));

        return Double.compare(gallon.getValue(), value) == 0;

    }


    public double getValue() {
        return value;
    }
}
