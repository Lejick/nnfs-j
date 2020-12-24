package jbased;

public class Linspace {
    private double current;
    private final double end;
    private final double step;

    public Linspace(double start, double end, double totalCount) {
        this.current=start;
        this.end=end;
        this.step=(end - start) / totalCount;
    }
    public boolean hasNext() {
        return current < (end + step/2); //MAY stop floating point error
    }
    public double getNextDouble() {
        current+=step;
        return current;
    }
}
