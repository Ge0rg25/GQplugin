package ru.gq.g25.quni;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import ru.gq.g25.quni.commands.CommandExample;
import ru.gq.g25.quni.config_manager.RegistrationService;
import ru.gq.g25.quni.config_manager.config.enums.DirectorySource;
import ru.gq.g25.quni.events.onJoin;

public final class GQ extends JavaPlugin {

    @Getter
    public static GQ instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        RegistrationService registrationService = new RegistrationService(this);
        registrationService.initConfigs(DirectorySource.NONE, "config");
        registrationService.initConfigs(DirectorySource.TITLES, "onJoin");
        new CommandExample(this);
        new onJoin(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
