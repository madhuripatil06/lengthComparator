package Compare.Length;

public enum LengthUnits {
    Feet(12),
    Centimeter(0.4),
    Inch(1),
    Millimeter(0.04);

    private double scale;

    LengthUnits(double scale) {
        this.scale = scale;
    }


    public double convertToInch(double value) {
        return value*scale;
    }
}