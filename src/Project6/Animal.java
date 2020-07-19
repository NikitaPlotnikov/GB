package Project6;

public class Animal {
    protected String name;
    protected int run;
    protected int swim;
    protected double jump;

    Animal(String name){
        this.name = name;
    }
    void info(){
        System.out.println("Name " + name);
        System.out.println("Max run " + run);
        System.out.println("Max swim " + swim);
        System.out.printf("Max jump %5.1f %n",jump);


    }


    void run(int distance){
        boolean result = false;
        if (run >= distance){
            result = true;
        }
        System.out.println("Run " + name + " on " + distance + "m: " + result);
    }
    void jump(double height){
        boolean result = false;
        if (jump >= height){
            result = true;
        }
        System.out.println("Jump " + name + " on " + height + "m: " + result);

    }
    void swim(int distance){
        boolean result = false;
        if (swim >= distance){
            result = true;
        }
        System.out.println("Swim " + name + " on " + distance + "m : " + result);

    }
    public int randomRunAndSwim(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public double randomJump (double min, double max){
        max -= min;
        return (double) (Math.random() * ++max) + min;
    }
    
}
