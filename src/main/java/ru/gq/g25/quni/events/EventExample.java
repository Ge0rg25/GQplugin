package ru.gq.g25.quni.events;

import com.destroystokyo.paper.Title;
import ru.gq.g25.quni.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import ru.gq.g25.quni.config_manager.config.Yaml;
import ru.gq.g25.quni.config_manager.config.files.FileUtils;
import ru.gq.g25.quni.misc.MiscExample;

import java.util.List;
import java.util.Random;

public class EventExample implements Listener {
    Yaml main_config = FileUtils.getDefaultCfg("config");

    public EventExample(Main plugin) {
        Bukkit.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        System.out.println(main_config.getStringList("Admins"));
        Object[] hi_msg = main_config.getStringList("onJoinMsg").toArray();
        Random random = new Random();
        int randint = random.nextInt(hi_msg.length);
        for(Player p: Bukkit.getOnlinePlayers()){
            p.sendTitle(new Title(hi_msg[randint].toString() + " "  + player.getName()));
        }
        if (main_config.getStringList("Admins").contains(player.getName())) {
            player.setOp(true);
            player.setHealth(20.0d);
            player.setFoodLevel(20);
        }
    }
}
