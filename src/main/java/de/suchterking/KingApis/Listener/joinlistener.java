package de.suchterking.KingApis.Listener;

import de.suchterking.KingApis.KingApis;
import de.suchterking.KingApis.utils.ScoreboardBuilder;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinlistener implements Listener {
    ScoreboardBuilder board = new ScoreboardBuilder("Lobby");
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        board.setScore("test", 1);
        board.setScoreboard(e.getPlayer());
    }


}
