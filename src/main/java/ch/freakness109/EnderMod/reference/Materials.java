package ch.freakness109.EnderMod.reference;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
    public static final class CondensedEnderTools {
        public static final Item.ToolMaterial CONDENSED_ENDER = EnumHelper.addToolMaterial(Reference.CONDENSED_ENDER_TOOL_MATERIAL, 3, 1000, 20, 10f, 10);
    }

    public static final class ChargedEnderTools {
        public static final Item.ToolMaterial CHARGED_ENDER = EnumHelper.addToolMaterial(Reference.CHARGED_ENDER_TOOL_MATERIAL, 3, 5000, 40, 24f, 100);
    }
}
