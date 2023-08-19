package org.laceperro.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobRemoverTabCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1) {
            List<String> options = new ArrayList<>();
            options.add("ELDER_GUARDIAN");
            options.add("WITHER_SKELETON");
            options.add("ZOMBIE_VILLAGER");
            options.add("SKELETON_HORSE");
            options.add("ZOMBIE_HORSE");
            options.add("DONKEY");
            options.add("MULE");
            options.add("EVOKER_FANGS");
            options.add("EVOKER");
            options.add("VEX");
            options.add("VINDICATOR");
            options.add("ILLUSIONER");
            options.add("CREEPER");
            options.add("SKELETON");
            options.add("SPIDER");
            options.add("GIANT");
            options.add("ZOMBIE");
            options.add("SLIME");
            options.add("GHAST");
            options.add("ZOMBIFIED_PIGLIN");
            options.add("ENDERMAN");
            options.add("CAVE_SPIDER");
            options.add("SILVERFISH");
            options.add("BLAZE");
            options.add("MAGMA_CUBE");
            options.add("ENDER_DRAGON");
            options.add("WITHER");
            options.add("BAT");
            options.add("WITCH");
            options.add("ENDERMITE");
            options.add("GUARDIAN");
            options.add("SHULKER");
            options.add("PIG");
            options.add("SHEEP");
            options.add("COW");
            options.add("CHICKEN");
            options.add("SQUID");
            options.add("WOLF");
            options.add("MUSHROOM_COW");
            options.add("SNOWMAN");
            options.add("OCELOT");
            options.add("IRON_GOLEM");
            options.add("HORSE");
            options.add("RABBIT");
            options.add("POLAR_BEAR");
            options.add("LLAMA");
            options.add("LLAMA_SPIT");
            options.add("PARROT");
            options.add("VILLAGER");
            options.add("TURTLE");
            options.add("PHANTOM");
            options.add("COD");
            options.add("SALMON");
            options.add("PUFFERFISH");
            options.add("TROPICAL_FISH");
            options.add("DROWNED");
            options.add("DOLPHIN");
            options.add("CAT");
            options.add("PANDA");
            options.add("PILLAGER");
            options.add("RAVAGER");
            options.add("TRADER_LLAMA");
            options.add("WANDERING_TRADER");
            options.add("FOX");
            options.add("BEE");
            options.add("HOGLIN");
            options.add("PIGLIN");
            options.add("STRIDER");
            options.add("ZOGLIN");
            options.add("PIGLIN_BRUTE");
            options.add("AXOLOTL");
            options.add("GLOW_SQUID");
            options.add("GOAT");
            options.add("ALLAY");
            options.add("FROG");
            options.add("TADPOLE");
            options.add("WARDEN");
            options.add("CAMEL");
            options.add("SNIFFER");
            return StringUtil.copyPartialMatches(args[0], options, new ArrayList<>());
        }
        return Collections.emptyList();
    }
}
