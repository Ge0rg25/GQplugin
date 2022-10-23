package g25.quni.ru.gq.Misc;

import org.bukkit.entity.Player;

import java.util.Objects;

public class MiscExample {
    public static void miscMethod(Player player) {
        if (Objects.equals(player.getName(), "G1928") || Objects.equals(player.getName(), "Quni1337")) {
            player.sendMessage("Ты супер сас! Крутой чел! А я кстати MISC!");
        }
    }

}
