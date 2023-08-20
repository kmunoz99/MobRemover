package org.laceperro.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.laceperro.MobRemover;

public class WeatherCommandRemoval implements CommandExecutor {
    private final MobRemover plugin;

    public WeatherCommandRemoval(MobRemover plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("weatherremover")){
            if (args.length != 1) {
                sendUsageMessage(sender);
                return false;
            }
            String value = args[0].toLowerCase();

            if (value.equals("enabled") || value.equals("disabled")) {
                setWeatherRemovalStatus(sender, value);
                return true;
            }

        }
        return false;
    }
    private void sendUsageMessage(CommandSender sender) {
        sender.sendMessage(ChatColor.RED + "Usage: /weatherremover <enabled|disabled>");

    }
    private void setWeatherRemovalStatus(CommandSender sender, String value) {
        plugin.getConfig().set("weather", value);
        plugin.saveConfig();
        sender.sendMessage(ChatColor.GREEN + "Weather removal has been " + ChatColor.RED + value + ChatColor.GREEN + ".");
    }
}
