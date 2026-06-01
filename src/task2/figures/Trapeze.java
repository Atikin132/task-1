package task2.figures;

import task2.Figure;

public class Trapeze extends Figure {
    private int baseA;
    private int baseB;
    private int sideC;
    private int sideD;
    private int height;

    public Trapeze(int baseA, int baseB, int sideC, int sideD, int height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    public int getBaseA() {
        return baseA;
    }

    public void setBaseA(int baseA) {
        this.baseA = baseA;
    }

    public int getBaseB() {
        return baseB;
    }

    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSideD() {
        return sideD;
    }

    public void setSideD(int sideD) {
        this.sideD = sideD;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) / 2f * height;
    }

    @Override
    public int getPerimeter() {
        return baseA + baseB + sideC + sideD;
    }

    @Override
    public String getName() {
        return "Trapeze";
    }
}
