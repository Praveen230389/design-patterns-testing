package com.mkyong.builder;

class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final boolean sunroof;
    private final boolean navigationSystem;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
    }

    public static class CarBuilder {
        private final String brand;
        private final String model;
        private int year;
        private boolean sunroof;
        private boolean navigationSystem;

        public CarBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder sunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder navigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean hasSunroof() {
        return sunroof;
    }

    public boolean hasNavigationSystem() {
        return navigationSystem;
    }
}
