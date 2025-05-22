package utils;

import java.awt.BasicStroke; 
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class DataAnalyzer {

 
    public static double calculateMean(List<Double> data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Data list cannot be null or empty for mean calculation.");
        }
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        return sum / data.size();
    }


    public static double calculateMedian(List<Double> data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Data list cannot be null or empty for median calculation.");
        }
        
        List<Double> sortedData = new java.util.ArrayList<>(data);
        Collections.sort(sortedData);

        int n = sortedData.size();
        if (n % 2 == 1) {
            return sortedData.get(n / 2);
        } else {
            return (sortedData.get(n / 2 - 1) + sortedData.get(n / 2)) / 2.0;
        }
    }

   
    public static double calculateMode(List<Double> data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Data list cannot be null or empty for mode calculation.");
        }

        Map<Double, Integer> frequencies = new HashMap<>();
        for (double d : data) {
            frequencies.put(d, frequencies.getOrDefault(d, 0) + 1);
        }

        double mode = Double.NaN;
        int maxFrequency = 0;

        for (Map.Entry<Double, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }
 return mode;
    }

   
    
    public static double calculateStandardDeviation(List<Double> data, boolean isPopulation) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Data list cannot be null or empty for standard deviation calculation.");
        }

        double mean = calculateMean(data);
        double sumOfSquaredDifferences = 0;
        for (double d : data) {
            sumOfSquaredDifferences += Math.pow(d - mean, 2);
        }

        int n = data.size();
        if (isPopulation) {
            return Math.sqrt(sumOfSquaredDifferences / n);
        } else {
            if (n < 2) {
                throw new IllegalArgumentException("Sample standard deviation requires at least 2 data points.");
            }
            return Math.sqrt(sumOfSquaredDifferences / (n - 1));
        }
    }


    
    public static double calculateSkewness(List<Double> data) {
        if (data == null || data.size() < 3) {
            throw new IllegalArgumentException("Data list must have at least 3 elements for skewness calculation.");
        }

        double mean = calculateMean(data);
        double stdDev = calculateStandardDeviation(data, false); 
        if (stdDev == 0) {
            return 0.0; 
        }

        double sumOfCubedDifferences = 0;
        for (double d : data) {
            sumOfCubedDifferences += Math.pow(d - mean, 3);
        }

        int n = data.size();

        double m3 = sumOfCubedDifferences / n;
        double skewness = m3 / Math.pow(stdDev, 3);

    
        if (n > 2) {
            skewness = skewness * Math.sqrt(n * (n - 1)) / (n - 2);
        }

        return skewness;
    }
}