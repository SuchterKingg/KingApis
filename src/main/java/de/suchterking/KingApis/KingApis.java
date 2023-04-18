package de.suchterking.KingApis;

import de.suchterking.KingApis.command.ticketGui;
import org.bukkit.plugin.java.JavaPlugin;

public final class KingApis extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gui").setExecutor(new ticketGui());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
