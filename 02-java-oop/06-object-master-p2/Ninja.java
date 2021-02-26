class Ninja extends Human {
    public Ninja() {
        this.stealth = 10;
    }

    public void steal(Human target) {
        target.health -= this.stealth;
        System.out.println(health);
    }

    public void runAway() {
        this.health -= 10;
        System.out.println(health);
    }
}
