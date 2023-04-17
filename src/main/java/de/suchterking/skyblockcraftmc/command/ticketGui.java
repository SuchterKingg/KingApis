package de.suchterking.skyblockcraftmc.command;

import de.suchterking.skyblockcraftmc.utils.GuiBuilder;
import de.suchterking.skyblockcraftmc.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ticketGui implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (!(commandSender instanceof Player)) return true;
        Player player = (Player) commandSender;

        GuiBuilder gui = new GuiBuilder(27, "Tickets");

        for (int i = 0; i < 10; i ++) {
            gui.setItem(i, new ItemBuilder(Material.ACACIA_BOAT).build());
        }

        gui.openGui(player);


        return false;
    }
}
