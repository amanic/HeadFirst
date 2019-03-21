package _3;

import java.util.ArrayList;

/**
 * @auther chen.haitao
 * @date 2019-03-20
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();

    private String s;


    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyRegisters() {
        for(int i = 0; i<observers.size() ;i++){
            observers.get(i).update(s);
        }
    }

    public void measurementsChanged(){
        notifyRegisters();
    }

    public void update(String s){
        this.s = s;
        measurementsChanged();
    }


}
