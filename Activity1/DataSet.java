package Activity1;

public class DataSet {
    private double[] data;
    private int dataSize;
    private double sum;

    public DataSet() {
        data = new double[100];
        dataSize = 0;
        sum = 0;
    }

    public void add(double value) {
        data[dataSize] = value;
        dataSize++;
        sum += value;
    }

    public double getAverage() {
        return (dataSize == 0) ? 0 : sum / dataSize;
    }

    // Part (a): Calculate standard deviation
    public double getStandardDevidation() {
        double mean = getAverage();
        double sumOfSquares = 0.0;
        for (int i = 0; i < dataSize; i++) {
            double diff = data[i] - mean;
            sumOfSquares += diff * diff; // More efficient than Math.pow(diff, 2)
        }
        return Math.sqrt(sumOfSquares / dataSize);
    }

    // Part (b): static method to compute average of averages
    public static double calculateAverage(DataSet[] datasets) {
        double total = 0.0;
        for (DataSet ds : datasets) {
            total += ds.getAverage();
        }
        return total / datasets.length;
    }

    // Example toString() method (as required by part (b))
    @Override
    public String toString() {
        return "DataSet[Size=" + dataSize + ", Avg=" + getAverage() + "]";
    }
}