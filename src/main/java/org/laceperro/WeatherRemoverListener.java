package org.laceperro;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherRemoverListener implements Listener {

    private final MobRemover plugin;

    public WeatherRemoverListener(MobRemover plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onWeatherChange(WeatherChangeEvent event){
        if (plugin.getConfig().getString("weather").equalsIgnoreCase("enabled")) {
            event.setCancelled(true);
        }

    }
}
