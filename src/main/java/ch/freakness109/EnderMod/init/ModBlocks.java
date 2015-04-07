package ch.freakness109.EnderMod.init;

import ch.freakness109.EnderMod.blocks.BlockEnderMod;
import ch.freakness109.EnderMod.blocks.CondensedEnderBlock;
import ch.freakness109.EnderMod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Axel on 06.04.2015.
 */
public class ModBlocks {
    public static final BlockEnderMod condensedEnderBlock = new CondensedEnderBlock();

    public static void init() {
        GameRegistry.registerBlock(condensedEnderBlock, Names.CONDENSED_ENDER_BLOCK);
    }
}
