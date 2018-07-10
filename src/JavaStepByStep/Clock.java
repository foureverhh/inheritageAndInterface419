package JavaStepByStep;

public class Clock  implements Comparable<Clock>{
    int time;
    int min;

    @Override
    public int compareTo(Clock o) {
        if(time < o.time || (time == o.time && min < o.min ))
            return -1;
        else if(time>o.time || (time == o.time && min > o.min))
            return 1;
        else
        return 0;
    }

    @Override
    public String toString(){
        return String.format("%d%d",time,min);
    }
}
