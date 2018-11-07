import java.util.LinkedList;

public class Planning {

    public Planning(){}

    /**
     * Used to extract the data of interest by using -999 as a terminator (think of strings w/ null char)
     * @param og daily rainfall data
     * @return if no -999 in data set: og, else, all nodes up to -999
     */
    LinkedList<Double> extractDataOfInterest(LinkedList<Double> og) {
        LinkedList<Double> sanitised = new LinkedList<>();
        for (Double d : og) {
            if (d != -999) {
                sanitised.add(d);
            } else {
                return sanitised;
            }
        }
        return sanitised;
    }

    /**
     * Calculate the average daily rainfall
     * @param dailyRainfallReadings may contain -999, indicating the end of the data of interest
     * @return the average of non-negative values in the list up to the first -999 (if it shows up), else -1
     */
    double rainfall (LinkedList<Double> dailyRainfallReadings) {
        LinkedList<Double> dataOfInterest = extractDataOfInterest(dailyRainfallReadings);
        double sum = 0;
        double nonFaultyReadings = 0;
        for (Double d : dataOfInterest) {
            if (d >= 0) {
                sum += d;
                nonFaultyReadings++;
            }
        }
        double average = sum / nonFaultyReadings;
        return average;
    }
}
