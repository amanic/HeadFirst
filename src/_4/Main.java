package _4;

/**
 * @auther chen.haitao
 * @date 2019-03-22
 */
public class Main {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();


        CurrentConditionDisplay display = new CurrentConditionDisplay(data);


        display.show();

        data.setmeasurements("1","2","3");

        data.deleteObserver(display);

        data.setmeasurements("4","5","6");


    }
}
