package ch.freakness109.EnderMod;

import ch.freakness109.EnderMod.utility.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class Teleport {

    static double waypointX = 0;
    static double waypointY = 0;
    static double waypointZ = 0;

    public static void teleportPlayer(EntityPlayer player) {
        if (waypointX == 0 && waypointY == 0 && waypointZ == 0) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "You must first set a waypoint before teleporting!"));
            return;
        }
        player.setPosition(waypointX, waypointY, waypointZ);
    }

    public static void setWaypoint(EntityPlayer player) {
        waypointX = player.posX;
        waypointY = player.posY;
        waypointZ = player.posZ;
        LogHelper.info(waypointX);
        LogHelper.info(waypointY);
        LogHelper.info(waypointZ);
    }

    public static void activateTeleport(EntityPlayer player) {
        LogHelper.info("Player " + player.toString() + " is using sword");
        if (player.isSneaking()) {
            setWaypoint(player);
        } else {
            teleportPlayer(player);
        }
    }

    public static void removeWaypoint() {
        waypointX = 0;
        waypointY = 0;
        waypointZ = 0;
    }
}
