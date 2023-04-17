package de.suchterking.skyblockcraftmc.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GuiBuilder {
    private Inventory inv;
    private String titlem;
    private Boolean c;
    public GuiBuilder (int size, String title) {
        inv = Bukkit.createInventory(null, size, title);
        titlem = title;
    }

    public GuiBuilder setItem(int slot, ItemStack item) {
        inv.setItem(slot, item);
        return this;
    }

    public GuiBuilder setCanceled(Boolean value) {
        c = value;
        return this;
    }

    public GuiBuilder openGui(Player player) {
        player.openInventory(inv);
        return this;
    }

    @EventHandler
    public void onItemClick(InventoryClickEvent e) {
        if (e.getCurrentItem().equals(null)) return;
        if (e.getView().getTitle().equals(titlem)) {
            if (c.equals(true)) {
                e.setCancelled(true);
            }else {
                e.setCancelled(false);
            }
        }
    }


}
