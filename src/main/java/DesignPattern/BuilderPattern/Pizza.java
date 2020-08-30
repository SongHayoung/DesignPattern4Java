package DesignPattern.BuilderPattern;

public class Pizza {
    private String topping;
    private String dough;
    private String sauce;

    public static class Builder {
        private String topping;
        private String dough;
        private String sauce;

        Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        this.topping = builder.topping;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dough : ");
        sb.append(dough);
        sb.append("\n");
        sb.append("Sauce : ");
        sb.append(sauce);
        sb.append("\n");
        sb.append("Topping : ");
        sb.append(topping);
        sb.append("\n");
        return sb.toString();
    }
}
