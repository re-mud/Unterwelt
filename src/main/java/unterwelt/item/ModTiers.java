package unterwelt.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers
{
    public static final Tier BONE = new ForgeTier(
            1,
            45,
            4.0f,
            0.0f,
            5,
            BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.BONE)
    ); 
}