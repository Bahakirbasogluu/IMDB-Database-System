import java.util.Comparator;
public class RateSORTED implements Comparator<id_avg>{
    public int compare(id_avg o1,id_avg o2){
        return o1.getAvg().compareTo(o2.getAvg());
    }
}
