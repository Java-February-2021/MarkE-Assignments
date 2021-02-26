class Wizard extends Human{

    public Wizard() {
        this.intelligence = 8;
        this.health = 50;
    }

    public void heal(Human target) {
        target.health += this.intelligence;
    }

    public void fireball(Human target) {
        target.health -= this.intelligence * 3;
    }
}