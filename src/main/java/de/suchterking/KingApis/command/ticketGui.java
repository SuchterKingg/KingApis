package de.suchterking.KingApis.command;

import de.suchterking.KingApis.utils.GuiBuilder;
import de.suchterking.KingApis.utils.ItemBuilder;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ticketGui implements CommandExecutor {

    private List<Player> playerList = new ArrayList<>();
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        Player player = (Player) commandSender;

        GuiBuilder gui = new GuiBuilder(27, "test");
                //.setItem(2, new ItemBuilder(Material.ACACIA_BOAT).build());

        gui.openGui(player);


        return false;
    }
}
