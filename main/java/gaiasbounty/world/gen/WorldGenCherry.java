package gaiasbounty.world.gen;

import gaiasbounty.world.gen.tree.TreeGenCherry;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * Creates cherry trees during chunk gen. Cherry trees can grow in non-snowy hill and mountain biomes.
 * 
 * @author Alex Smith
 */
public class WorldGenCherry implements IWorldGenerator
{
   private static final WorldGenerator generator = new TreeGenCherry();
   
   @Override
   public void generate(Random rand, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
   {
      BiomeGenBase biome = world.getBiomeGenForCoords(chunkX * 16 + 8,
               chunkZ * 16 + 8);

      if (rand.nextInt(20) == 0 && (BiomeDictionary.isBiomeOfType(biome, Type.HILLS)
                                || BiomeDictionary.isBiomeOfType(biome, Type.MOUNTAIN))
    		                    && !BiomeDictionary.isBiomeOfType(biome, Type.SNOWY))
      {
         int x, y, z;
         
         for (int i = 0; i < 20; i++)
         {
            x = chunkX * 16 + rand.nextInt(16);
            z = chunkZ * 16 + rand.nextInt(16);
            y = world.getTopSolidOrLiquidBlock(x, z) - 1;

            if (generator.generate(world, rand, x, y + 1, z))
            {
               break;
            }
         }
      }
   }
}
