package io.github.iamantoo.antoplugin.data.entities;

import org.joml.Vector3d;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class AntoLife implements Serializable {
    private String name;
    private String surname;
    private String birthDate;
    private double money;
    private boolean bankAccountOwner;
    private UUID key;
    private final List<AntoTestResult> results = new ArrayList<>();

    public AntoLife(String name, String surname, String birthDate, double money, boolean bankAccountOwner, UUID key) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.money = money;
        this.bankAccountOwner = bankAccountOwner;
        this.key = key;
    }

    public AntoLife(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public AntoLife() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isBankAccountOwner() {
        return bankAccountOwner;
    }

    public void setBankAccountOwner(boolean bankAccountOwner) {
        this.bankAccountOwner = bankAccountOwner;
    }

    public UUID getKey() {
        return key;
    }

    public void setKey(UUID key) {
        this.key = key;
    }

    public List<AntoTestResult> getResults() {
        return results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AntoLife antoLife = (AntoLife) o;
        return Double.compare(money, antoLife.money) == 0 && bankAccountOwner == antoLife.bankAccountOwner && Objects.equals(name, antoLife.name) && Objects.equals(surname, antoLife.surname) && Objects.equals(birthDate, antoLife.birthDate) && Objects.equals(key, antoLife.key) && Objects.equals(results, antoLife.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, money, bankAccountOwner, key, results);
    }
}
