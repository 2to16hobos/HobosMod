package magical.mod.proxy;

import magical.mod.capabilities.CapabilityHandler;
import magical.mod.capabilities.IMana;
import magical.mod.capabilities.Mana;
import magical.mod.capabilities.ManaStorage;
import magical.mod.util.handlers.EventHandler;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class CommonProxy{

	public void registerModel(Item item, int metadata) {}
	
	public void init()
    {
        CapabilityManager.INSTANCE.register(IMana.class, new ManaStorage(), Mana.class);

        MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
}
