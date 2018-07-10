package JavaStepByStep;

public class Observation implements Comparable<Observation>{
    Clock clock = new Clock();
    int num;
    double temp;
    int windSpeed;
    int windPower;
    @Override
    public int compareTo(Observation o) {
        return clock.compareTo(o.clock);
    }
}
