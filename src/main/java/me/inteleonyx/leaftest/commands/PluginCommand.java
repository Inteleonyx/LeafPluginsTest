package me.inteleonyx.leaftest.commands;

import me.inteleonyx.leaftest.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PluginCommand implements TabExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player to use this command.");
            return true;
        }
        Player p = (Player) sender;
        if (!p.hasPermission("leaftest.reload")) {
            p.sendMessage("You don't have permission to use this command.");
            return true;
        }
        Main plugin = Main.getInstance;


        if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            Bukkit.getPluginManager().disablePlugin(plugin);
            Bukkit.getPluginManager().enablePlugin(plugin);
            return true;
        }

        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings.length == 1) {
            return List.of("reload");
        }
        return null;
    }
}
