package Project7;

public class Cat {
    private String name;
    private int appetite;
    private Boolean satiety = false;

    public Cat(String name, int appetite){
        this.name =name;
        this.appetite = appetite;

    }

    public void eat(Plate plate){
        satiety = plate.decreaseFood(appetite);
    }

    public void catInfo(){
        System.out.println("Cat: " + name + ". Satiety: " + satiety );
    }
}
