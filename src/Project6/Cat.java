package Project6;

public class Cat extends Animal {


    Cat(String name){
        super(name);
        run = randomRunAndSwim(100,300);
        swim = 0;
        jump = randomJump(1.0, 3.0);
    }

}
