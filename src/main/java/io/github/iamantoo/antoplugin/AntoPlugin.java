package io.github.iamantoo.antoplugin;

import io.github.iamantoo.antoplugin.data.entities.AntoPlayer;
import io.github.iamantoo.antoplugin.data.repositories.FileRepository;
import io.github.iamantoo.antoplugin.data.repositories.Repository;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

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

    public Player getPlayerFromUUID(UUID uuid){
        return Bukkit.getOnlinePlayers().stream().filter(p -> p.getUniqueId().equals(uuid)).findFirst().orElse(null);
    }

    public void sendMessage(UUID uuid, String title, String message){
        Player p = getPlayerFromUUID(uuid);

        if(p == null) return;

        p.sendMessage("§l[" + title + "] §r" + message);
    }
}
