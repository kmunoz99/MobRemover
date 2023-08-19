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

        getServer().getPluginManager().registerEvents(new MobRemoverListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}