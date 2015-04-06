package ch.freakness109.EnderMod.creativetab;

import ch.freakness109.EnderMod.init.ModItems;
import ch.freakness109.EnderMod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Axel on 06.04.2015.
 */
public class CreativeTabEnderMod {
    public static final CreativeTabs ENDERMOD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.condensedEnder;
        }
    };
}
