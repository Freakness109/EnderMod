package ch.freakness109.EnderMod.init;

import ch.freakness109.EnderMod.item.CondensedEnder;
import ch.freakness109.EnderMod.item.ItemEnderMod;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Axel on 06.04.2015.
 */
public class ModItems {
    public static final ItemEnderMod condensedEnder = new CondensedEnder();

    public static void init() {
        GameRegistry.registerItem(condensedEnder, "condensedEnder");
    }
}
