package _3;

/**
 * @auther chen.haitao
 * @date 2019-03-21
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherData);

        weatherData.update("1");
        weatherData.update("2");
        weatherData.unRegister(current);
        weatherData.update("3");


    }
}
