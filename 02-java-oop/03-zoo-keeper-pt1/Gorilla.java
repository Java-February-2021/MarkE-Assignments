class Gorilla extends Mammal {
    public Gorilla() {
        super("gorilla", energyLevel);
    }

    public void throwSomething() {
        System.out.println("The gorilla threw a rock. Energy decreased by 5");
        this.energyLevel -= 5;
    }

    public void eatBanana() {
        System.out.println("The gorilla ate a banana. Energy increased by 10");
        this.energyLevel += 10;
    }
    public void climb() {
        System.out.println("The gorilla climbed a tree. Energy decreased by 10");
        this.energyLevel -= 10;
    }
} 