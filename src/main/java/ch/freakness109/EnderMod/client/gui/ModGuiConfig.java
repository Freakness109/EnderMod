package ch.freakness109.EnderMod.client.gui;

import ch.freakness109.EnderMod.handler.ConfigurationHandler;
import ch.freakness109.EnderMod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by Axel on 06.04.2015.
 */
public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
