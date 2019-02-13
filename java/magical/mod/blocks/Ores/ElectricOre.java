package magical.mod.blocks.Ores;

import java.util.ArrayList;
import java.util.Random;

import magical.mod.blocks.BlockBase;
import magical.mod.init.ItemInit;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ElectricOre extends BlockBase{

	public ElectricOre(String name, Material material, CreativeTabs tab) {
		super(name, material, tab);
		
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(3F);
		setHarvestLevel("Pickaxe", 1);
		
		
	}
	
	@Override 
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune){
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		
		drops.add(new ItemStack(ItemInit.ELECTRIC_NUGGET, RANDOM.nextInt(1)+2));
		if(RANDOM.nextFloat()>0.5f) {
			drops.add(new ItemStack(ItemInit.ELECTRIC_NUGGET, 1));
		}
		
		return drops;
	}

}
