package g25.quni.ru.gq;

import org.bukkit.plugin.java.JavaPlugin;

public final class GQ extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Привет зайчики!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Идите нафиг тупые");
    }
}
