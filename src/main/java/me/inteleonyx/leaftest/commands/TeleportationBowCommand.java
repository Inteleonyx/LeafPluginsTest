package me.inteleonyx.leaftest.commands;

import me.inteleonyx.leaftest.event.TeleportationBowEvent;
import me.inteleonyx.leaftest.util.CreateBowItem;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TeleportationBowCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Player player = (Player) commandSender;
        player.getInventory().addItem(CreateBowItem.createBowItem());
        player.getInventory().addItem(ItemStack.of(Material.ARROW, 1));
        return false;
    }
}
