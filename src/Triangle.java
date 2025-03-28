public class Triangle extends Shape{
    private int baseSide,sideB,sideC,high;

    public Triangle(Point location, int baseSide, int sideB, int sideC,int high) {
        super(location);
        this.baseSide = baseSide;
        this.sideB = sideB;
        this.sideC = sideC;
        this.high = high;
    }

    public int getSideA() {
        return baseSide;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        if (high < 0){
            this.high = 0;
            throw new IllegalArgumentException("Side Cant be negative!");
        }
        else {
            this.high = high;
        }
    }

    public void setSideA(int baseSide) {
        if (baseSide < 0){
            this.baseSide = 0;
            throw new IllegalArgumentException("Side Cant be negative!");
        }
        else {
            this.baseSide = baseSide;
        }
    }

    public void setSideB(int sideB) {
        if (sideB < 0){
            this.sideB = 0;
            throw new IllegalArgumentException("Side Cant be negative!");
        }
        else {
            this.sideB = sideB;
        }
    }

    public void setSideC(int sideC) {
        if (sideC < 0){
            this.sideC = 0;
            throw new IllegalArgumentException("Side Cant be negative!");
        }
        else {
            this.sideC = sideC;
        }
    }

    @Override
    public double area() {
        return baseSide * high /2.0;
    }

    @Override
    public double perimeter() {
        return baseSide +sideB+sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + baseSide +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
