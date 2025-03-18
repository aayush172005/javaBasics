public class HealthPotion extends GameItem {

    private int increase;
    public HealthPotion(double xLoc, double yLoc, int increase){
        super(xLoc,yLoc);
        this.increase=increase;
    }
    public void use(){
        System.out.println("Points Healed: " + this.increase);
    }
    }


