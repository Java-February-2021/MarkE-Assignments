class Calculator {

    private double x;
    private double y;
    private double total = 0.0;
    private String operator;

    public Calculator(double x, double y, String operator) {
        this.x = x;
        this.y = y;
        this.operator = operator;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void performOperation() {
        if(operator.equals("+")) {
            total = x + y;
        } else if(operator.equals("-")) {
            total = x - y;
        }
    }
    public double getResults() {
        return total;
    }
}