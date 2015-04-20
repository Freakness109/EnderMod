package ch.freakness109.EnderMod.item;

import ch.freakness109.EnderMod.reference.Names;
import ch.freakness109.EnderMod.utility.NBTHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;


public class HealthStorage extends ItemEnderMod {
    public HealthStorage() {
        super();
        this.setUnlocalizedName(Names.HEALTH_STORAGE);
    }


    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if (player.isSneaking()) {
            if (!player.capabilities.isCreativeMode) {
                //only damage player if not in creative
                player.setHealth(player.getHealth() - 1);
            }
            //Write Health to NBT
            NBTHelper.setFloat(itemStack, "healthStored", NBTHelper.getFloat(itemStack, "healthStored") + 1);
            return itemStack;
        }
        if (player.shouldHeal() && (NBTHelper.getFloat(itemStack, "healthStored") > 0)) {
            //if enough health, remove 1 and heal player
            NBTHelper.setFloat(itemStack, "healthStored", NBTHelper.getFloat(itemStack, "healthStored") - 1);
            player.setHealth(player.getHealth() + 1);
        }
        return itemStack;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(StatCollector.translateToLocal("tooltip.healthStorage1") + " " + String.valueOf(NBTHelper.getFloat(stack, "healthStored") / 2) + StatCollector.translateToLocal("tooltip.healthStorage2"));
    }

}
