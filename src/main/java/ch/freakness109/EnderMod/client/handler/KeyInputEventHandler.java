package ch.freakness109.EnderMod.client.handler;


import ch.freakness109.EnderMod.client.settings.Keybindings;
import ch.freakness109.EnderMod.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {
    @SubscribeEvent
    public void handleKey(InputEvent.KeyInputEvent event) {
        if (Keybindings.teleport.isPressed()) {
            LogHelper.info("Key pressed");
        }
    }
}
