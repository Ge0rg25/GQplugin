package g25.quni.ru.gq.Events;

import g25.quni.ru.gq.GQ;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import g25.quni.ru.gq.Misc.MiscExample;
import java.util.Random;

public class EventExample implements Listener {
    public EventExample(GQ plugin){
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
