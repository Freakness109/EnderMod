package ch.freakness109.EnderMod.item;

import ch.freakness109.EnderMod.creativetab.CreativeTabEnderMod;
import ch.freakness109.EnderMod.reference.Reference;
import ch.freakness109.EnderMod.utility.LogHelper;
import ch.freakness109.EnderMod.utility.NBTHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class SwordEnderMod extends ItemSword {
    private static int cooldown = 0;

    public SwordEnderMod(ToolMaterial material) {
        super(material);
        this.setCreativeTab(CreativeTabEnderMod.ENDERMOD_TAB);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

        if (player.isSneaking()) {
            NBTHelper.setDouble(itemStack, "posX", player.posX);
            NBTHelper.setDouble(itemStack, "posY", player.posY);
            NBTHelper.setDouble(itemStack, "posZ", player.posZ);
            return itemStack;
        }
        if (NBTHelper.getFloat(itemStack, "posX") == 0 && NBTHelper.getFloat(itemStack, "posY") == 0 && NBTHelper.getFloat(itemStack, "posZ") == 0) {
            if (!world.isRemote) {
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + StatCollector.translateToLocal("error.noWaypoint")));
            }
            return itemStack;
        }
        if (cooldown > 0) {
            if (!world.isRemote) {
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + StatCollector.translateToLocal("error.cooldown")));
                LogHelper.info(cooldown);
            }
            return itemStack;
        }

        if (!player.onGround) {
            player.fallDistance = 0;
        }
        if (!world.isRemote) {
            cooldown = 100;
            player.setPositionAndUpdate(NBTHelper.getDouble(itemStack, "posX"), NBTHelper.getDouble(itemStack, "posY"), NBTHelper.getDouble(itemStack, "posZ"));
        }
        LogHelper.info(cooldown);
        return itemStack;
    }

    @Override
    public void onCreated(ItemStack stack, World world, EntityPlayer player) {
        NBTHelper.setDouble(stack, "posX", 0);
        NBTHelper.setDouble(stack, "posY", 0);
        NBTHelper.setDouble(stack, "posZ", 0);
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) {
        if (cooldown > 0) {
            cooldown--;
        } else if (cooldown != 0) {
            cooldown = 0;
        }
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(StatCollector.translateToLocal("tooltip.teleport1"));
        list.add(StatCollector.translateToLocal("tooltip.teleport2"));
        list.add(StatCollector.translateToLocal("tooltip.waypoint"));
        list.add(StatCollector.translateToLocal("tooltip.X") + " " + String.valueOf(Math.round(NBTHelper.getDouble(stack, "posX") * 100.0) / 100.0));
        list.add(StatCollector.translateToLocal("tooltip.Y") + " " + String.valueOf(Math.round(NBTHelper.getDouble(stack, "posY") * 100.0) / 100.0));
        list.add(StatCollector.translateToLocal("tooltip.Z") + " " + String.valueOf(Math.round(NBTHelper.getDouble(stack, "posZ") * 100.0) / 100.0));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
