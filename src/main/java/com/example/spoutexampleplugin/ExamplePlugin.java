package com.example.spoutexampleplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Don't do anything else if the server doesn't support Spout
        if (!CheckSpout.checkSpout()) return;

        // TODO register events using Bukkit.getPluginManager().registerEvents(..) here?
        getLogger().info(getName() + " has been enabled!");
    }

}
