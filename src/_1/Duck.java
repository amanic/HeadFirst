package _1;

/**
 * @auther chen.haitao
 * @date 2019-03-19
 */
public abstract class Duck {

    public void swim(){
        System.out.println(" I Can Swim ...");
    }

    public void quack(){
        System.out.println(" I Can Quack ...");
    }

    /**
     * 此时，如果要某些鸭子可以飞，有两种实现方法:
     * 1、在抽象类中实现fly方法，但是不是所有鸭子都会飞。
     * 2、在抽象类中增加fly抽象方法，所有鸭子实现类都要修改。
     * 3、将动作抽象成接口，但是冗余代码会有很多。
     */


    public abstract void display();
}
