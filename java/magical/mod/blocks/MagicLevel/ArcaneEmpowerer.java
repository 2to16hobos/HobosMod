package magical.mod.blocks.MagicLevel;

import magical.mod.blocks.BlockBase;
import magical.mod.capabilities.IMana;
import magical.mod.capabilities.Mana;
import magical.mod.capabilities.ManaProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ArcaneEmpowerer extends BlockBase{

	public ArcaneEmpowerer(String name, Material material, CreativeTabs tab) {
		super(name, material, tab);
		
		setSoundType(SoundType.STONE);
		setHardness(1.0F);
		setResistance(3F);
		setHarvestLevel("Pickaxe", 1);
	}
	
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		IMana mana = playerIn.getCapability(ManaProvider.MANA_CAP, null);
		
		
		String messageowo = String.format("Click!");
		
		playerIn.sendMessage(new TextComponentString(messageowo));
		
		if(mana.getManaLevel() <= playerIn.experienceLevel) {
			mana.upManaLevel(1);
			mana.setMaxMana(50);
			String message = String.format("You leveled up! Current level: §7%d§r", (int) mana.getManaLevel());
			playerIn.sendMessage(new TextComponentString(message));
			playerIn.addExperience(-1000000000);
		}
		else {
			String message = String.format("You need more experience! You are level: §7%d§r", (int) mana.getManaLevel());
			playerIn.sendMessage(new TextComponentString(message));
		}
		
		return true;
	}

}
