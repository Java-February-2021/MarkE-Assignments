class Samurai extends Human {

    private int samuraiAmount = 0;
    public Saumrai() {
        this.health = 200;
        samuraiAmount += 1;
    }

    public void deathBlow(Human target) {
        target.health = 0;
        this.health = health / 2;
    }

    public void meditate() {
        this.health = health * 1.5;
    }

    public static int howMany() {
        return Samurai.samuraiAmount;
        System.out.println(Samurai.samuraiAmount);
    }
}