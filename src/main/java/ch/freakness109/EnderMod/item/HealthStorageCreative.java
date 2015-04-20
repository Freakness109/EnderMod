package ch.freakness109.EnderMod.item;

import ch.freakness109.EnderMod.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class HealthStorageCreative extends ItemEnderMod {
    public HealthStorageCreative() {
        super();
        this.setUnlocalizedName(Names.HEALTH_STORAGE_CREATIVE);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if (player.shouldHeal()) {
            player.setHealth(player.getHealth() + 1);
        }
        return itemStack;
    }


    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(StatCollector.translateToLocal("tooltip.creative"));

    }
}
