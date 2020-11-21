package Model;

import java.util.Date;

public class DataInput {
    public String Name;

    public String getName() {
        return Name;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public double getOpen() {
        return Open;
    }

    public double getHigh() {
        return High;
    }

    public double getLow() {
        return Low;
    }

    public double getClose() {
        return Close;
    }

    public int getVolume() {
        return Volume;
    }

    public Date Date;
    public double Open, High, Low, Close;
    public int Volume ;

    public DataInput(String Name, java.util.Date Date ,
                     double Open, double High, double Low,
                     double Close, int Volume) {
        this.Name = Name;
        this.Date = Date;
        this.Open = Open;
        this.High = High;
        this.Low = Low;
        this.Close = Close;
        this.Volume = Volume;
    }
}