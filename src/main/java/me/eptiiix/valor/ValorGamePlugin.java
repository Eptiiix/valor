package me.eptiiix.valor;

import lombok.Getter;
import me.eptiiix.valor.player.PlayerController;
import me.eptiiix.valor.player.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class ValorGamePlugin extends JavaPlugin {

    private PlayerController playerController;

    @Override
    public void onEnable() {
        initialization();
        registerListeners();
    }

    private void initialization() {
        this.playerController = new PlayerController();
    }

    private void registerListeners() {
        final PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerListener(playerController), this);
    }

}
