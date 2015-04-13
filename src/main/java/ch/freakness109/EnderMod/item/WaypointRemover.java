package ch.freakness109.EnderMod.item;


import ch.freakness109.EnderMod.Teleport;
import ch.freakness109.EnderMod.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class WaypointRemover extends ItemEnderMod {
    public WaypointRemover() {
        super();
        this.setUnlocalizedName(Names.WAYPOINT_REMOVER);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(StatCollector.translateToLocal("tooltip.waypointRemover"));
        list.add(StatCollector.translateToLocal("tooltip.creativeOnly"));
    }

    @Override
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        return true;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        Teleport.removeWaypoint();
        return itemStack;
    }
}
