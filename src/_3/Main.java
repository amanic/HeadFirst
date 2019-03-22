package _3;

/**
 *
 * Subject是主题，可以注册和注销观察者，Observer是观察者。实现订阅模式。
 * 每次主题有变化，可以调用通知，通知所有注册过来的观察者。
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
