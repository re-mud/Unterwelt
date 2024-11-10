package unterwelt;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(Unterwelt.MOD_ID)
public class Unterwelt
{
    public static final String MOD_ID = "unterwelt";

    public Unterwelt()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
