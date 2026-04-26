package com.example.spoutexampleplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Don't do anything else if the server doesn't support Spout
        if (!CheckSpout.checkSpout(getComponentLogger())) return;

        Bukkit.getPluginManager().registerEvents(new ExamplePluginListener(), this);
        getLogger().info(getName() + " has been enabled!");
    }

}
