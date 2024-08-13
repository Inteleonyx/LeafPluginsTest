package me.inteleonyx.leaftest.util;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class CreateBowItem {
    public static ItemStack createBowItem() {
        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemMeta meta = bow.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Arco do Teleporte");
        List<String> lore = new ArrayList<>();
        lore.add("Teleporte-se!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.INFINITY, 1, false);
        bow.setItemMeta(meta);
        return bow;
    }
}
