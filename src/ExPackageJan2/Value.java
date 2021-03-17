package ExPackageJan2;

import java.util.Objects;

public class Value {
    private int value;

    public Value(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value1 = (Value) o;
        return getValue() == value1.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
