class Bat extends Mammal{

    public Bat() {
        super("bat", 300);
    }

    public void fly() {
        System.out.println("Bat flew. Energy decreased by 50.");
        this.energyLevel -= 50;
    }

    public void eatHuman() {
        System.out.println("The so- well, never mind");
        this.energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Bat attacked a town! Energy decreased by 100.");
        this.energyLevel -= 100;
    }
    public int getEnergy() {
        return this.energyLevel;
    }
}