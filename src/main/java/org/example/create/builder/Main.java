package org.example.create.builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new SaltWaterBuilder();
        Director dir = new Director(builder);
        dir.constract();
        SaltWater saltWater = (SaltWater) builder.getResult();
    }
}
