package ch.freakness109.EnderMod.init;

import ch.freakness109.EnderMod.item.CondensedEnder;
import ch.freakness109.EnderMod.item.CondensedEnderSword;
import ch.freakness109.EnderMod.item.ItemEnderMod;
import ch.freakness109.EnderMod.item.SwordEnderMod;
import ch.freakness109.EnderMod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Axel on 06.04.2015.
 */
public class ModItems {
    public static final ItemEnderMod condensedEnder = new CondensedEnder();
    public static final SwordEnderMod condensedEnderSword = new CondensedEnderSword();

    public static void init() {
        GameRegistry.registerItem(condensedEnder, Names.CONDENSED_ENDER);
        GameRegistry.registerItem(condensedEnderSword, Names.CONDENSED_ENDER_SWORD);
    }
}
