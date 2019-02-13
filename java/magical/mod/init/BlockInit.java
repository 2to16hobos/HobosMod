package magical.mod.init;

import java.util.ArrayList;
import java.util.List;

import magical.mod.Main;
import magical.mod.blocks.BlockBase;
import magical.mod.blocks.MagicLevel.ArcaneEmpowerer;
import magical.mod.blocks.Ores.EarthOre;
import magical.mod.blocks.Ores.ElectricOre;
import magical.mod.blocks.Ores.FireOre;
import magical.mod.blocks.Ores.IceOre;
import magical.mod.blocks.Ores.LifeOre;
import magical.mod.blocks.Ores.MetalOre;
import magical.mod.blocks.Ores.NatureOre;
import magical.mod.blocks.Ores.WaterOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MANA_BLOCK = new BlockBase("mana_block", Material.IRON, Main.MMITEM);
	
	
	
	public static final Block EARTH_ORE = new EarthOre("earth_ore", Material.ROCK, Main.MMITEM);
	public static final Block FIRE_ORE = new FireOre("fire_ore", Material.ROCK, Main.MMITEM);
	public static final Block ICE_ORE = new IceOre("ice_ore", Material.ROCK, Main.MMITEM);
	public static final Block LIFE_ORE = new LifeOre("life_ore", Material.ROCK, Main.MMITEM);
	public static final Block NATURE_ORE = new NatureOre("nature_ore", Material.ROCK, Main.MMITEM);
	public static final Block METAL_ORE = new MetalOre("metal_ore", Material.ROCK, Main.MMITEM);
	public static final Block WATER_ORE = new WaterOre("water_ore", Material.ROCK, Main.MMITEM);
	public static final Block ELECTRIC_ORE = new ElectricOre("electric_ore", Material.ROCK, Main.MMITEM);
	
	public static final Block ARCANE_EMPOWERER = new ArcaneEmpowerer("arcane_empowerer", Material.ROCK, Main.MMITEM);
}
