package ch.freakness109.EnderMod;

import ch.freakness109.EnderMod.handler.ConfigurationHandler;
import ch.freakness109.EnderMod.init.ModBlocks;
import ch.freakness109.EnderMod.init.ModItems;
import ch.freakness109.EnderMod.proxy.IProxy;
import ch.freakness109.EnderMod.reference.Reference;
import ch.freakness109.EnderMod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.Version, guiFactory = Reference.GUI_FACTORY_CLASS)
public class EnderMod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance(Reference.MOD_ID)
    public static EnderMod instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        LogHelper.info("Preinit Starting");

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LogHelper.info("Init Starting");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        LogHelper.info("Postinit Starting");
    }
}
