package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


class DataEntry {
    private String name;
    private List<Double> data1;
    private List<Double> data2;
    private String timestamp;

    public DataEntry(String name, List<Double> data1, List<Double> data2) {
        this.name = name;
        this.data1 = data1;
        this.data2 = data2;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String getName() {
        return name;
    }

    public List<Double> getData1() {
        return data1;
    }

    public List<Double> getData2() {
        return data2;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return name + " (" + timestamp + ")";
    }
}