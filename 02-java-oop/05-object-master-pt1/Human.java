class Human {

    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    public void attack(Human target) {
        this.health -= this.strength;
        System.out.println("Target attacked for" + strength + "reducing health by" + strength);
    }
}