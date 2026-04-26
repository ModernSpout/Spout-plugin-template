package com.example.spoutexampleplugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class ExamplePluginListener implements Listener {

    private static final Material GREEN_SCREEN_BLOCK = Material.matchMaterial("example_stuff:example_green_screen_block");

    private final Set<UUID> playersLookingAtGreenScreen = new HashSet<>();

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Block block = player.getTargetBlockExact(100);
        if (block != null) {
            if (block.getType() == GREEN_SCREEN_BLOCK) {
                if (playersLookingAtGreenScreen.add(player.getUniqueId())) {
                    player.sendMessage(Component.text("You are looking at a green screen", TextColor.color(0, 255, 0)));
                }
            } else {
                playersLookingAtGreenScreen.remove(player.getUniqueId());
            }
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        playersLookingAtGreenScreen.remove(event.getPlayer().getUniqueId());
    }

}
