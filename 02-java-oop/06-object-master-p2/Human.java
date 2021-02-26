class Human {

    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;
    public Human (int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return this.stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Human target) {
        this.health -= this.strength;
        System.out.println("Target attacked for" + strength + "reducing health by" + strength);
    }
}
