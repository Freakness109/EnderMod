package ch.freakness109.EnderMod.item;

import ch.freakness109.EnderMod.reference.Materials;
import ch.freakness109.EnderMod.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ChargedEnderSword extends SwordEnderMod {
    public ChargedEnderSword() {
        super(Materials.ChargedEnderTools.CHARGED_ENDER);
        this.setUnlocalizedName(Names.CHARGED_ENDER_SWORD);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(StatCollector.translateToLocal("tooltip.teleport1"));
        list.add(StatCollector.translateToLocal("tooltip.teleport2"));
    }
}
