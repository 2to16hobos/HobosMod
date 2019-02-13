package magical.mod;

import magical.mod.proxy.CommonProxy;
import magical.mod.util.References;
import magical.mod.world.generation.WorldGenCustomOres;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.SidedProxy;
import magical.mod.creativetabs.ItemTab;
import net.minecraft.creativetab.CreativeTabs;


@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Main {
	
	
	public static final String MODID = "mm";
    public static final String VERSION = "0.1";
    
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = References.CLIENT, serverSide = References.COMMON)
	
	public static CommonProxy proxy;
	
	public static final CreativeTabs MMITEM = new ItemTab();
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 1);
		proxy.init();
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
		
	}
}
