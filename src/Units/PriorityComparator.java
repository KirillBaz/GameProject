package Units;

import java.util.Comparator;

public class PriorityComparator implements Comparator<BaseUnit> {
    @Override
    public int compare(BaseUnit o1, BaseUnit o2) {
        return Integer.compare(o1.priority, o2.priority);
    }
}
