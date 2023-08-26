package io.github.iamantoo.antoplugin.login.listeners;

import io.github.iamantoo.antoplugin.AntoPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerJoinListener implements Listener {
    private final AntoPlugin plugin;

    public PlayerJoinListener(AntoPlugin p){
        this.plugin = p;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        // fetching player

        // se l'utente è presente recupera i dati
        // altrimenti lo crea  sul database
    }
}
