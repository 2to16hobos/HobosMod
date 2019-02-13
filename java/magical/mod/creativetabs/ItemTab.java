package magical.mod.creativetabs;

import magical.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemTab extends CreativeTabs{
	
	public ItemTab() 
	{
		super("mmitem");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.MANA_INGOT);
	}

}
