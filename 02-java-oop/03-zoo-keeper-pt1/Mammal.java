class Mammal {

    protected String name;
    protected int energyLevel;
    public Mammal(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return this.energyLevel;
    }

    public void setEnergy(int energyLevel) {
        this.energyLevel = energyLevel;
    }

}