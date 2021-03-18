package com.company.February.Hw18February.Car;

public class SteeringWheel {

    private double size;
    private String material;
    private boolean multiSW;

    public SteeringWheel(double size, String material, boolean multiSW) {
        this.size = size;
        this.material = material;
        this.multiSW = multiSW;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isMultiSW() {
        return multiSW;
    }

    public void setMultiSW(boolean multiSW) {
        this.multiSW = multiSW;
    }

    public double getMagnification(double size) {
        return size + 3;
    }
}
