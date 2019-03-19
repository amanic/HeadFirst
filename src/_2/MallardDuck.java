package _2;

/**
 * @auther chen.haitao
 * @date 2019-03-19
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        this.setFlyBehavior(new CanntFly());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println(" i am a mallard duck...");
    }


}
