package ch.freakness109.EnderMod.proxy;

import ch.freakness109.EnderMod.client.settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(Keybindings.teleport);
    }
}
