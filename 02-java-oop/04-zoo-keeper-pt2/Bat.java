public class Bat extends Mammal{
    
    public Bat(){
        this.energyLevel = 300;
    }
    
    public void fly(){
        this.energyLevel -= 50;
        System.out.println("Flapping of wings, bat takes off. Energy reduced by 50");
    }

    public void eatHumans(){
        this.energyLevel += 25;
        System.out.println("Wahaha.... blood. Gained 25 energy");
    }

    public void attackTown(){
        this.energyLevel -= 100;
        System.out.println("The bats have attacked. The fire crackles as smoke fills the air. Energy reduced by 100");
    }
}
