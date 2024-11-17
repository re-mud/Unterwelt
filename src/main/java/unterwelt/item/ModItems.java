package unterwelt.item;

import unterwelt.Unterwelt;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ModItems 
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Unterwelt.MODID);

    public static final RegistryObject<Item> BONEBLADE = registerSwordItem("boneblade", ModTiers.BONE, 4, -2.2f);

    private static RegistryObject<Item> registerSwordItem(String name, Tier tier, int damage, float speed)
    {
        return ITEMS.register(name, () -> new SwordItem(tier, damage, speed, new Item.Properties().tab(ModCreativeModTabs.UNTERWELT_WEAPONS)));
    }

    public static void register(IEventBus modEventBus)
    {
        ITEMS.register(modEventBus);
    }
}