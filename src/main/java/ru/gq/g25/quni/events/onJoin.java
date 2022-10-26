package ru.gq.g25.quni.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import ru.gq.g25.quni.GQ;
import ru.gq.g25.quni.config_manager.config.Yaml;
import ru.gq.g25.quni.config_manager.config.enums.DirectorySource;
import ru.gq.g25.quni.config_manager.config.files.FileUtils;

import java.util.List;
import java.util.Random;

public class onJoin implements Listener {

    public onJoin(GQ plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Yaml config = FileUtils.getDirectoryFile(DirectorySource.TITLES, "onJoin");
        Player joiner = event.getPlayer();
        if (config.getBoolean("enable_title")) {
            joiner.sendTitle(
                    config.getString("main_text"),
                    config.getString("sub_text"),
                    30,
                    config.getInt("title_time"),
                    30
            );
        }
        if (config.getBoolean("enable_broadcast")){
            Random random = new Random();
            List<String> hi_msg = config.getStringList("onJoinMsg");
            String msg_choise = hi_msg.get(random.nextInt(hi_msg.size()-1));
            Bukkit.broadcastMessage(msg_choise + " " + joiner.getDisplayName());
        }
    }
}
