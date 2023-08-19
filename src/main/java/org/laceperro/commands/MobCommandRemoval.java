package org.laceperro.commands;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.laceperro.MobRemover;

import java.util.List;

public class MobCommandRemoval implements CommandExecutor {
    private final MobRemover plugin;

    public MobCommandRemoval(MobRemover plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("mobs")){
            if (args.length != 1) {
                sendUsageMessage(sender);
                return false;
            }
            String value = args[0].toLowerCase();
            String result = "disabled";
            List<String> mobs = plugin.getConfig().getStringList("mobs");
            if (mobs.contains(value)){
                mobs.remove(value);
                plugin.getConfig().set("mobs", mobs);
                plugin.saveConfig();

            }
            else {
                result = "enabled";
                mobs.add(value);
                plugin.getConfig().set("mobs", mobs);
                plugin.saveConfig();
            }
            sender.sendMessage(ChatColor.GREEN + " "+ value + " removal has been " + ChatColor.RED + result + ChatColor.GREEN + ".");
            return true;
        }
        return false;

    }





    private void sendUsageMessage(CommandSender sender) {
        sender.sendMessage(ChatColor.RED + "Usage: /mobs <skeletons|blaze|wither_skeleton>");

    }





}
