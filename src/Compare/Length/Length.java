package Compare.Length;

public class Length {

    private final double value;
    private final LengthUnits scale;

    public Length(double value, LengthUnits scale) {
        this.value = value;
        this.scale = scale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length other = (Length) o;
        double otherValue = other.scale.convertToInch(other.value);
        double thisValue = this.scale.convertToInch(value);
        return  otherValue == thisValue ;
    }

    public Length add(Length other) {
        double sum = other.scale.convertToInch(other.value)+scale.convertToInch(value);
        return new Length(sum, LengthUnits.Inch);
    }
}
