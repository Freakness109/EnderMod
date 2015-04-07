package ch.freakness109.EnderMod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Axel on 06.04.2015.
 */
public class ModRecipies {
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ModItems.condensedEnder), "eee", "eee", "eee", 'e', new ItemStack(Items.ender_pearl));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.condensedEnderBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.condensedEnder));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.condensedEnder, 9), new ItemStack(ModBlocks.condensedEnderBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl, 9), new ItemStack(ModItems.condensedEnder));
        GameRegistry.addRecipe(new ItemStack(ModItems.condensedEnderSword), " e ", " e ", " s ", 'e', new ItemStack(ModItems.condensedEnder), 's', new ItemStack(Items.stick));
    }
}
