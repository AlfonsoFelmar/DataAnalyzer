package utils;


import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects; 



import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects; 

public class DataEntry {
    private int id; 
    private String name;
    private List<Double> data1;
    private List<Double> data2;
    private String timestamp;


    public DataEntry(String name, List<Double> data1, List<Double> data2) {
        this(-1, name, data1, data2, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }


    public DataEntry(int id, String name, List<Double> data1, List<Double> data2, String timestamp) {
        this.id = id;
        this.name = name;
        this.data1 = data1;
        this.data2 = data2;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataEntry dataEntry = (DataEntry) o;
      
        return id == dataEntry.id &&
               Objects.equals(name, dataEntry.name) &&
               Objects.equals(timestamp, dataEntry.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, timestamp);
    }
}
