package com.mkyong.builder;

class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean olives;

    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.olives = builder.olives;
    }

    public static class PizzaBuilder {
        private final String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean olives;

        public PizzaBuilder(String size) {
            this.size = size;
        }

        public PizzaBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder olives(boolean olives) {
            this.olives = olives;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    public String getSize() {
        return size;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasPepperoni() {
        return pepperoni;
    }

    public boolean hasOlives() {
        return olives;
    }
}

