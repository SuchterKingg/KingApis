package de.suchterking.KingApis.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class ScoreboardBuilder {

    private Scoreboard scoreboard;
    private Objective objective;

    public ScoreboardBuilder(String name) {

        scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        objective = scoreboard.registerNewObjective(name, "dummy");

    }

    public ScoreboardBuilder setScoreboard(Player player) {
        player.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        player.setScoreboard(scoreboard);
        return this;
    }

    public ScoreboardBuilder setScore(String content, int score) {
        objective.getScore(content).setScore(score);
        return this;
    }

    public ScoreboardBuilder setTeam(String name, String entry, int score, String content) {
        objective.getScore(entry).setScore(score);
        Team team = scoreboard.registerNewTeam(name);
        team.addEntry(entry);
        team.setPrefix(content);
        return this;
    }

    public ScoreboardBuilder hideScorboard(Player player) {
        player.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
        return this;
    }

    public ScoreboardBuilder showScoreBoard(Player player) {
        player.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
        player.setScoreboard(scoreboard);
        return this;
    }

    public ScoreboardBuilder updateTeam(String teamname, String content) {
        Team team = scoreboard.getTeam(teamname);
        team.setPrefix(content);
        return this;
    }

}
