package Project7;

public class Plate {

    private int food;

    public Plate(int food){
        this.food = food;

    }

    public void printInfo(){
        System.out.println("plate: " + food);
    }

    public boolean decreaseFood(int val){
        if (val > this.food){
            return false;
        }
        this.food -= val;
        return true;
    }

    public void fillPlate(int val){
        food += val;
    }
}
