package Activity1;

public class Main {
    public static void main(String[] args) {
        // Test Part(a): Standard Deviation
        DataSet dataset = new DataSet();
        dataset.add(10);
        dataset.add(12);
        dataset.add(14);
        dataset.add(16);
        dataset.add(18);
        System.out.println("Standard Deviation: " + dataset.getStandardDevidation());

        // Test part (b): Average of Average
        DataSet[] datasets = new DataSet[3];

        DataSet ds1 = new DataSet();
        ds1.add(2);
        ds1.add(4);
        ds1.add(6);

        DataSet ds2 = new DataSet();
        ds2.add(1);
        ds2.add(3);
        ds2.add(5);

        DataSet ds3 = new DataSet();
        ds3.add(10);
        ds3.add(20);

        datasets[0] = ds1;
        datasets[1] = ds2;
        datasets[2] = ds3;

        System.out.println("Average of Averages: " + DataSet.calculateAverage(datasets));
    }
}