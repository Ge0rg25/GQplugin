package g25.quni.ru.gq;

import org.bukkit.plugin.java.JavaPlugin;
import g25.quni.ru.gq.Commands.CommandExample;
import g25.quni.ru.gq.Events.EventExample;

public final class GQ extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new CommandExample(this);
        new EventExample(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
