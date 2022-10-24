package ru.gq.g25.quni.events;

import ru.gq.g25.quni.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import ru.gq.g25.quni.misc.MiscExample;

import java.util.Random;

public class EventExample implements Listener {
    public EventExample(Main plugin){
        Bukkit.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onEvent(PlayerJoinEvent event){
        Player player = event.getPlayer();
        Random randomizer = new Random();
        String[] hi_msg = new String[]{"Поприветствуем", "Встречайте", "К нам с ноги залетел", "К нам запрыгнул"};
        int choice = randomizer.nextInt(hi_msg.length);
        Bukkit.broadcastMessage(hi_msg[choice] + " " + player.getName());
        player.sendMessage("Приветик!");
        MiscExample.miscMethod(player);
    }
}
