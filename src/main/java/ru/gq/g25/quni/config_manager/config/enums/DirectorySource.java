package ru.gq.g25.quni.config_manager.config.enums;

import lombok.Getter;

public enum DirectorySource {
    PLAYER("playerdata"),
    MENU("menu"),
    DATA("data"),
    SPECIAL("runes"),
    TITLES("titles"),
    NONE("");

    @Getter
    private final String type;

    DirectorySource(String type) {
        this.type = type;
    }

}
