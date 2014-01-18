package eu.tomylobo.xmltest;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class XmlTest extends JavaPlugin implements Listener {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        final String[] args = event.getMessage().split(" ", 2);
        final String arg = args[0];
        if (arg.equals("/xmltest")) {
            Bukkit.broadcastXmlMessage(args[1]);
            event.setCancelled(true);
        }
    }
}
