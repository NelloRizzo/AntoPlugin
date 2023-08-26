package io.github.iamantoo.antoplugin.data.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class AntoPlayer implements Serializable {
    // il player puo avere tante vite
    // ogni vita ha nome e cognome

    private final List<AntoLife> lives =new ArrayList<>();
    private AntoLife lifeUserIsLiving;
    private UUID player;
    private boolean isFrozen;

    public AntoPlayer() {
    }

    public AntoPlayer(AntoLife lifeUserIsLiving, UUID player, boolean isFrozen) {
        this.lifeUserIsLiving = lifeUserIsLiving;
        this.player = player;
        this.isFrozen = isFrozen;
    }

    public AntoPlayer(UUID player) {
        this.player = player;
    }

    public List<AntoLife> getLives() {
        return lives;
    }

    public AntoLife getLifeUserIsLiving() {
        return lifeUserIsLiving;
    }

    public void setLifeUserIsLiving(AntoLife lifeUserIsLiving) {
        this.lifeUserIsLiving = lifeUserIsLiving;
    }

    public UUID getPlayer() {
        return player;
    }

    public void setPlayer(UUID player) {
        this.player = player;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AntoPlayer that = (AntoPlayer) o;
        return isFrozen == that.isFrozen && Objects.equals(lives, that.lives) && Objects.equals(lifeUserIsLiving, that.lifeUserIsLiving) && Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lives, lifeUserIsLiving, player, isFrozen);
    }
}
