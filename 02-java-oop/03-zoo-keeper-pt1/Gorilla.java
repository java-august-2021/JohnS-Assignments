public class Gorilla extends Mammal{
    public void throwSomething(){
        this.energyLevel -= 5;
        System.out.println("Throw nearest item, loose 5 energy");
    }

    public void eatBananas(){
        this.energyLevel += 10;
        System.out.println("Yum Yum Banana's good. Increase energy by 10");
    }
    
    public void climb(){
        this.energyLevel -= 10;
        System.out.println("Climbing up something. Loose 10 energy");
    }
}
