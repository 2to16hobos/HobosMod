package magical.mod.world.generation;

import java.util.Random;

import com.google.common.base.Predicate;

import magical.mod.init.BlockInit;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator{
	
	private WorldGenerator earth_ore;
	//private WorldGenerator copper_ore_nether, copper_ore_end;
	
	public WorldGenCustomOres() 
	{
		
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{

		switch(world.provider.getDimension()) {
			//Nether
			case -1:
				
				runGenerator(BlockInit.FIRE_ORE.getDefaultState(), 5, 10, 15, 70, BlockMatcher.forBlock(Blocks.LAVA), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.FIRE_ORE.getDefaultState(), 3, 12, 15, 100, BlockMatcher.forBlock(Blocks.NETHERRACK), world, random, chunkX, chunkZ);
				
					break;
  			//Overworld
			case 0:
					
				runGenerator(BlockInit.EARTH_ORE.getDefaultState(), 7, 12, 15, 70, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.EARTH_ORE.getDefaultState(), 7, 12, 15, 70, BlockMatcher.forBlock(Blocks.DIRT), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.WATER_ORE.getDefaultState(), 3, 15, 20, 70, BlockMatcher.forBlock(Blocks.WATER), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.ICE_ORE.getDefaultState(), 10, 12, 15, 65, BlockMatcher.forBlock(Blocks.ICE), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.ICE_ORE.getDefaultState(), 10, 12, 15, 65, BlockMatcher.forBlock(Blocks.PACKED_ICE), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.LIFE_ORE.getDefaultState(), 3, 12, 15, 70, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.LIFE_ORE.getDefaultState(), 3, 12, 15, 70, BlockMatcher.forBlock(Blocks.GRASS), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.ELECTRIC_ORE.getDefaultState(), 3, 12, 15, 50, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.NATURE_ORE.getDefaultState(), 6, 12, 15, 100, BlockMatcher.forBlock(Blocks.GRASS), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.NATURE_ORE.getDefaultState(), 2, 12, 15, 100, BlockMatcher.forBlock(Blocks.LEAVES), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.NATURE_ORE.getDefaultState(), 6, 12, 15, 100, BlockMatcher.forBlock(Blocks.LEAVES2), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.METAL_ORE.getDefaultState(), 6, 12, 15, 30, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
				runGenerator(BlockInit.FIRE_ORE.getDefaultState(), 2, 5, 10, 15, BlockMatcher.forBlock(Blocks.LAVA), world, random, chunkX, chunkZ);
				
					break;
  			//End
			case 1:
				
				
					break;
  			//Everything else
			default:
				
				
					break;
		}
	}
	
	private void runGenerator(IBlockState blockToGen, int blockAmount,  int chancesToSpawn, int minHeight, int maxHeight, Predicate<IBlockState> blockToReplace, World world, Random rand, int chunk_X, int chunk_Z){
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		WorldGenMinable generator = new WorldGenMinable(blockToGen, blockAmount, blockToReplace);
		int heightdiff = maxHeight - minHeight +1;
		for (int i=0; i<chancesToSpawn; i++){
			int x = chunk_X * 16 +rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightdiff);
			int z = chunk_Z * 16 + rand.nextInt(16);

			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}
