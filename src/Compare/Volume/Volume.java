package Compare.Volume;

public class Volume {

    private  double value;
    private  VolumeUnits unit;

    public Volume(double value, VolumeUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public Volume add(Volume otherVolume) {
        double sum = unit.convetToLitre(value) + otherVolume.unit.convetToLitre(otherVolume.value);
        return new Volume(sum,VolumeUnits.LITRE);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Volume other = (Volume) o;
        double otherValue = other.unit.convetToLitre(other.value);
        double thisValue = this.unit.convetToLitre(value);
        return  otherValue == thisValue ;
    }
}
