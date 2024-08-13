package me.inteleonyx.leaftest;

import lombok.Getter;
import me.inteleonyx.leaftest.commands.PluginCommand;
import me.inteleonyx.leaftest.commands.TeleportationBowCommand;
import me.inteleonyx.leaftest.event.TeleportationBowEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Getter public static Main getInstance;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getInstance = this;
        getServer().getPluginManager().registerEvents(new TeleportationBowEvent(), this);
        getCommand("leaftest").setExecutor(new PluginCommand());
        getCommand("tpbow").setExecutor(new TeleportationBowCommand());
    }

    @Override
    public void onDisable() {

    }
}
