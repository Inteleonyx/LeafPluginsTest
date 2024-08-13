package me.inteleonyx.leaftest.event;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

public class TeleportationBowEvent implements Listener {
    @EventHandler
    public void onTeleport(ProjectileHitEvent e) {
        if (e.getEntity().getType() != EntityType.ARROW) return;
        if (e.getEntity().getShooter() instanceof Player p) {
            ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
            String itemName = ChatColor.GREEN + "" + ChatColor.BOLD + "Arco do Teleporte";
            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(itemName)) {
                Location blockLocation = e.getEntity().getLocation();
                p.teleport(blockLocation);
            }
        }
    }
}
