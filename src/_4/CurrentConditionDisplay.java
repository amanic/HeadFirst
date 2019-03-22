package _4;

import java.util.Observable;
import java.util.Observer;

/**
 * @auther chen.haitao
 * @date 2019-03-22
 */
public class CurrentConditionDisplay implements Observer,DisplayMent {

    private Observable observable;

    private String temperature;

    private String humidity;


    public CurrentConditionDisplay(Observable o){
        this.observable = o;
        observable.addObserver(this);
    }


    @Override
    public void show() {
        System.out.println("show :"+temperature+", "+humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            this.humidity = ((WeatherData) o).getHumidity();
            this.temperature = ((WeatherData) o).getTemperature();
            show();
        }
    }

}
