package unterwelt.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import unterwelt.Unterwelt;

public class ModCreativeModTabs 
{
    public static final CreativeModeTab UNTERWELT_WEAPONS = new CreativeModeTab(Unterwelt.MODID + ".unterweltWeapons")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BONEBLADE.get());
        }
    };
}