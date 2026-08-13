package com.microservices.limitsservice.bean;

import java.util.Objects;

public class Limits {
    private int minimum;
    private int maximum;

    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Limits limits)) return false;
        return minimum == limits.minimum && maximum == limits.maximum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimum, maximum);
    }

    @Override
    public String toString() {
        return "Limits{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }
}
