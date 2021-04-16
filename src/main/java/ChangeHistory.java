import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        double max = history.get(0);
        for (double item : history) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
    
    public double minValue() {
        double min = history.get(0);
        for (double item : history) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }
    
    public double average() {
        double sum = 0;
        for (double item : history) {
            sum += item;
        }
        return sum / history.size();
    }
    
    
}
