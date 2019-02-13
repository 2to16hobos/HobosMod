package magical.mod.capabilities;

import magical.mod.Main;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CapabilityHandler {
	
	public static final ResourceLocation MANA_CAP = new ResourceLocation(Main.MODID, "mana");

    @SubscribeEvent
	public void attatchCapability(AttachCapabilitiesEvent<Entity> event) {
    	
    	if(!(event.getObject() instanceof EntityPlayer)) return;
    	
    	event.addCapability(MANA_CAP, new ManaProvider());
    	
    }

}
