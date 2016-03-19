package Compare.Volume;

public interface Volume {
    Volume convertTo(Volume other);
    double getValue();
    Volume add(Object other) throws Exception;
}