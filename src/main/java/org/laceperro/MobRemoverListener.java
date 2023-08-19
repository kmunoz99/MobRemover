package org.laceperro;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.List;

public class MobRemoverListener implements Listener {
    private final MobRemover plugin;

    public MobRemoverListener(MobRemover plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        String entityName = String.valueOf(event.getEntityType()).toLowerCase();
        List<String> mobs = plugin.getConfig().getStringList("mobs");
        if (mobs.contains(entityName)) {
            event.setCancelled(true);
        }

    }
}
