package io.github.iamantoo.antoplugin.data.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class AntoTestResult implements Serializable {
    private AntoTest test;
    private Date executionDate;
    private boolean result;
    private BigDecimal level;

    public AntoTestResult(AntoTest test, Date executionDate, boolean result, BigDecimal level) {
        this.test = test;
        this.executionDate = executionDate;
        this.result = result;
        this.level = level;
    }

    public AntoTestResult() {
    }

    public AntoTest getTest() {
        return test;
    }

    public void setTest(AntoTest test) {
        this.test = test;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public BigDecimal getLevel() {
        return level;
    }

    public void setLevel(BigDecimal level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AntoTestResult that = (AntoTestResult) o;
        return result == that.result && Objects.equals(test, that.test) && Objects.equals(executionDate, that.executionDate) && Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test, executionDate, result, level);
    }
}
