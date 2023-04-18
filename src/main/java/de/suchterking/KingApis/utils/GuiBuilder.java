package de.suchterking.KingApis.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class GuiBuilder {
    private Inventory inv;
    private String titlem;
    public static List<String> guiList;
    public GuiBuilder (int size, String title) {
        inv = Bukkit.createInventory(null, size, title);
        titlem = title;
        guiList.add(title);
    }

    public GuiBuilder setItem(int slot, ItemStack item) {
        inv.setItem(slot, item);
        return this;
    }

    public GuiBuilder openGui(Player player) {
        player.openInventory(inv);
        return this;
    }


}
