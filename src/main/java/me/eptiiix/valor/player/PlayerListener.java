package me.eptiiix.valor.player;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    final PlayerController playerController;

    public PlayerListener(final PlayerController playerController) {
        this.playerController = playerController;
    }

    @EventHandler
    public void controlPlayerJoin(final PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        playerController.create(player);
    }

    @EventHandler
    public void controlPlayerQuit(final PlayerQuitEvent event) {
        final Player player = event.getPlayer();
        playerController.delete(playerController.get(player));
    }

}
