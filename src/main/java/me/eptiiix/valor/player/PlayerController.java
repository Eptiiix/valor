package me.eptiiix.valor.player;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerController {

    private final Map<UUID, ValorPlayer> valorPlayers = new HashMap<>();

    public void create(final Player player) {
        final ValorPlayer valorPlayer = new ValorPlayer(player.getName(), player.getUniqueId(), null, 0, 0,0, 0, 0);
        if(!exists(valorPlayer)) valorPlayers.put(player.getUniqueId(), valorPlayer);
    }

    public ValorPlayer get(final Player player) {
        return valorPlayers.get(player.getUniqueId());
    }

    public boolean exists(final ValorPlayer valorPlayer) {
        return valorPlayers.containsKey(valorPlayer.getUniqueId());
    }

    public void delete(final ValorPlayer valorPlayer) {
        if(exists(valorPlayer)) valorPlayers.remove(valorPlayer.getUniqueId());
    }

}
