package _4;

import java.util.Observable;

/**
 * @auther chen.haitao
 * @date 2019-03-22
 */
public class WeatherData extends Observable {

    private String temperature;

    private String humidity;

    private String pressure;

    public WeatherData() {

    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }


    public void setmeasurements(String tmp, String hmd, String prs) {
        this.setHumidity(hmd);
        this.setPressure(prs);
        this.setTemperature(tmp);
        measurementsChanged();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}
