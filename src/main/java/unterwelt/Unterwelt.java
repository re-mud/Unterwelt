package unterwelt;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;
import unterwelt.item.ModItems;
import unterwelt.item.ModCreativeModTabs;
@Mod(Unterwelt.MODID)
public class Unterwelt
{
    public static final String MODID = "unterwelt";

    public Unterwelt()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
    }
}
