package _2;

/**
 * @auther chen.haitao
 * @date 2019-03-19
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("mute...");
    }
}
