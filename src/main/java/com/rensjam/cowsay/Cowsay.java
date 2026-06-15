package com.rensjam.cowsay;

import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Cowsay extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Cowsay Plugin Successfully Loaded!");

        PluginCommand command = getCommand("cowsay");
        if (command != null) {
            command.setExecutor(new cowsayCommand());
        }

    }

    @Override
    public void onDisable() {
        getLogger().info("Cowsay Plugin Successfully Unloaded!");
    }
}
