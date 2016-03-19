package Compare.Volume;

import Compare.Length.Unit;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Gallon implements Volume {
    private double value;

    public Gallon(double value) {
        this.value = value;
    }

    private Volume getScaleFor(Class className){
        HashMap<Class ,Volume> Volumes =  new HashMap<Class , Volume>();
        Volumes.put(Litre.class , new Litre(value*3.78));
        return  Volumes.get(className);
    }

    @Override
    public Volume convertTo(Volume other) {
        return getScaleFor(other.getClass());
    }

    @Override
    public Volume add(Object other) throws Exception {
        if (other instanceof Unit)
            throw new Exception("my teacher is an idiot");
        else {
            Volume otherUnit = ((Volume) other).convertTo(new Litre(0));
            Volume liter = getScaleFor(Litre.class);
            double sum = liter.getValue() + otherUnit.getValue();

            DecimalFormat df = new DecimalFormat("#.##");

            double result = Double.valueOf(df.format(sum));
            return new Litre(result);
        }
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