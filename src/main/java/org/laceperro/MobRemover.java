package org.laceperro;
import org.bukkit.plugin.java.JavaPlugin;
import org.laceperro.commands.*;


public final class MobRemover extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();

        getCommand("mobs").setExecutor(new MobCommandRemoval(this));
        getCommand("mobs").setTabCompleter(new MobRemoverTabCompleter());

        getCommand("weatherremover").setExecutor(new WeatherCommandRemoval(this));
        getCommand("weatherremover").setTabCompleter(new WeatherTabCompleter());

        getServer().getPluginManager().registerEvents(new MobRemoverListener(this), this);
        getServer().getPluginManager().registerEvents(new WeatherRemoverListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}