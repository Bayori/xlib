package me.nekorise.Hex;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class MMessage
{
    private static final MiniMessage miniMessage = MiniMessage.miniMessage();

    /**
     * Applies color and formatting to the given text.
     *
     * @param text The text with MiniMessage format, e.g., "<#77b1de>Colored Text!"
     * @return Component formatted text for use in Minecraft.
     */
    public static Component applyColor(String text) {
        return miniMessage.deserialize(text);
    }
    public static Component applyColorWithAmpersand(String text) {
        return miniMessage.deserialize(HEX.applyColor(text));
    }
}
