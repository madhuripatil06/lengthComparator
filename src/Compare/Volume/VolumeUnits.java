package Compare.Volume;

import java.text.DecimalFormat;

public enum VolumeUnits {
    LITRE(1),
    GALLON(1d/3.78);


    private double scale;

    VolumeUnits(double scale) {
        this.scale = scale;
    }

    public double convetToLitre(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.valueOf(decimalFormat.format(value/scale));
    }
}
