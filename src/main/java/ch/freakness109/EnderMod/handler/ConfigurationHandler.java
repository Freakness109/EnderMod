package ch.freakness109.EnderMod.handler;

import ch.freakness109.EnderMod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean fun = false;

    public static void init(File configFile) {
        //create config
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        fun = configuration.getBoolean("fun", Configuration.CATEGORY_GENERAL, true, "Do you like fun?");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Resync config
            loadConfiguration();
        }
    }
}
