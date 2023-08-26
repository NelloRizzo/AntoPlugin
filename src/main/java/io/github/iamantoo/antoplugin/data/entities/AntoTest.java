package io.github.iamantoo.antoplugin.data.entities;

import java.io.Serializable;
import java.util.Objects;

public class AntoTest implements Serializable {
    private String name;

    public AntoTest(String name) {
        this.name = name;
    }

    public AntoTest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AntoTest antoTest = (AntoTest) o;
        return Objects.equals(name, antoTest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
