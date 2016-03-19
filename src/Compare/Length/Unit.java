package Compare.Length;

import Compare.Volume.Gallon;
import Compare.Volume.Litre;

import java.util.HashMap;

public class Unit {
    private Class nameOfClass;
    private double givenValue;

    public Unit(Class nameOfClass, double givenValue) {
        this.nameOfClass = nameOfClass;
        this.givenValue = givenValue;
    }
    public Inch convertToInch(Class className, double value){
        HashMap<Class, Inch> scales = new HashMap<>();
        scales.put(Feet.class, new Inch(value*12));
        scales.put(Centimeter.class, new Inch(value/2.5));
        scales.put(Inch.class , new Inch(value));
        scales.put(Milimeter.class , new Inch(value/25));
        return scales.get(className);
    }

    public double getValue() {
        return givenValue;
    }

    public Unit add(Unit other) {
        Unit otherUnit =  other.convertToInch(other.getClass(), other.getValue());
        Unit inch = convertToInch(nameOfClass, givenValue);
        double sum = inch.getValue()+ otherUnit.getValue();
        return new Inch(sum);
    }

    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || !(o instanceof Unit)) return false;
        Unit thisInInch = convertToInch(nameOfClass, givenValue);
        Unit otherInInch = ((Unit) o).convertToInch(o.getClass(), ((Unit) o).getValue());
        return Double.compare(thisInInch.getValue(), otherInInch.getValue()) == 0;
    }
}
