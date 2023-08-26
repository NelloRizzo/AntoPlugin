package io.github.iamantoo.antoplugin;

import io.github.iamantoo.antoplugin.data.entities.AntoPlayer;
import io.github.iamantoo.antoplugin.data.repositories.FileRepository;
import io.github.iamantoo.antoplugin.data.repositories.Repository;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntoPlugin extends JavaPlugin {

    private final Repository<AntoPlayer> players = new FileRepository<>("./database.db");

    public Repository<AntoPlayer> getPlayers() {
        return players;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        // this.database = getFromDatabase
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
