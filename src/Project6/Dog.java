package Project6;

public class Dog extends Animal{

    Dog(String name){
        super(name);
        run = randomRunAndSwim(300,700);
        swim = randomRunAndSwim(8, 30);
        jump = randomJump(0.3, 1.5);
    }
}
