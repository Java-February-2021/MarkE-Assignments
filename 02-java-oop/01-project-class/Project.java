class Project {
    private String name;
    private String description;
    private double cost;
    public Project(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public double getCost() {
        return this.cost;
    }
    public void setName(String[] args) {
        this.name = name;
    }
    public void setDescription(String[] args) {
        this.description = description;
    }
    public void setCost(double[] args) {
        this.cost = cost;
    }
    public void elevatorPitch() {
        System.out.printf("%s ($%.2f) : %s", this.name, this.cost, this.description);
    }
}