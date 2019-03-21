package _3;

/**
 * @auther chen.haitao
 * @date 2019-03-20
 */
public interface Subject {

    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyRegisters();


}
