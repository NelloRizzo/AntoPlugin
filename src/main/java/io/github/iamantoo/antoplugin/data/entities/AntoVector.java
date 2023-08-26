package io.github.iamantoo.antoplugin.data.entities;

import java.io.Serializable;
import java.util.Objects;

public class AntoVector implements Serializable {
    private int x;
    private int y;
    private int z;

    public AntoVector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public AntoVector() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AntoVector that = (AntoVector) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
