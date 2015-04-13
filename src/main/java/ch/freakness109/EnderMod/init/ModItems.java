package ch.freakness109.EnderMod.init;

import ch.freakness109.EnderMod.item.*;
import ch.freakness109.EnderMod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemEnderMod condensedEnder = new CondensedEnder();
    public static final SwordEnderMod condensedEnderSword = new CondensedEnderSword();
    public static final SwordEnderMod chargedEnderSword = new ChargedEnderSword();
    public static final ItemEnderMod waypointRemover = new WaypointRemover();
    public static void init() {
        GameRegistry.registerItem(condensedEnder, Names.CONDENSED_ENDER);
        GameRegistry.registerItem(condensedEnderSword, Names.CONDENSED_ENDER_SWORD);
        GameRegistry.registerItem(chargedEnderSword, Names.CHARGED_ENDER_SWORD);
        GameRegistry.registerItem(waypointRemover, Names.WAYPOINT_REMOVER);
    }
}
