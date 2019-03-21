package _3;

/**
 * @auther chen.haitao
 * @date 2019-03-21
 */
public class CurrentConditionsDisplay implements Observer,DisplayMent{

    private String msg;

    private Subject weather;


    public CurrentConditionsDisplay(Subject weather) {
        this.weather = weather;
        weather.register(this);
    }

    @Override
    public void show() {
        System.out.println("目前状况是："+msg);
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        show();
    }


}
