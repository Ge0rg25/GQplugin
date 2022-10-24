package ru.gq.g25.quni;

import ru.gq.g25.quni.commands.ChangeConfig;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import ru.gq.g25.quni.commands.CommandExample;
import ru.gq.g25.quni.events.EventExample;
import ru.gq.g25.quni.config_manager.RegistrationService;
import ru.gq.g25.quni.config_manager.config.enums.DirectorySource;

public final class Main extends JavaPlugin {

    @Getter
    public static Main instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        RegistrationService registrationService = new RegistrationService(this);
        registrationService.initConfigs(DirectorySource.NONE, "config");
        new CommandExample(this);
        new EventExample(this);
        new ChangeConfig(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
