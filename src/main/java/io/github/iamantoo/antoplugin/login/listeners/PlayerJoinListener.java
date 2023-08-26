package io.github.iamantoo.antoplugin.login.listeners;

import io.github.iamantoo.antoplugin.AntoPlugin;
import io.github.iamantoo.antoplugin.data.entities.AntoLife;
import io.github.iamantoo.antoplugin.data.entities.AntoPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PlayerJoinListener implements Listener {
    private final AntoPlugin plugin;

    public PlayerJoinListener(AntoPlugin p) {
        this.plugin = p;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        // fetching player

        // se l'utente è presente recupera i dati
        // altrimenti lo crea  sul database

        plugin.getPlayers().readAll()
                .filter(p -> p.getPlayer().equals(e.getPlayer().getUniqueId()))
                .findFirst()
                .ifPresentOrElse(
                        p -> {
                            UUID id = p.getPlayer();

                            // present -> deve fare il login classico
                            plugin.sendMessage(id, "SERVIZIO DI LOGIN", "Seleziona una vita in cui giocare digitando il numero corrispondente");

                            p.getLives().forEach(l -> {
                                plugin.sendMessage(id, "" + p.getLives().indexOf(l), l.getName() + " " + l.getSurname());
                            });

                            //  da adesso ci sta il chat handler
                        },
                        () -> {
                            // absent -> deve fare il login come nuovo
                            UUID uuid = e.getPlayer().getUniqueId();

                            plugin.getPlayers().create(new AntoPlayer(uuid));

                            plugin.sendMessage(uuid, "UFFICIO ANAGRAFE", "In un messaggio in chat, digita nome, cognome e data di nascita.");
                            plugin.sendMessage(uuid, "UFFICIO ANAGRAFE", "§nFormato:§r NOME COGNOME GG/MM/AAAA");
                            plugin.sendMessage(uuid, "UFFICIO ANAGRAFE", "§nEsempio:§r MARIO ROSSI 01/01/2000");

                            // da ora c'è il chat handler
                        }
                );
    }
}
