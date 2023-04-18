package de.suchterking.KingApis;

import de.suchterking.KingApis.Listener.joinlistener;
import de.suchterking.KingApis.command.ticketGui;
import org.bukkit.plugin.java.JavaPlugin;

public final class KingApis extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gui").setExecutor(new ticketGui());
        getServer().getPluginManager().registerEvents(new joinlistener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
