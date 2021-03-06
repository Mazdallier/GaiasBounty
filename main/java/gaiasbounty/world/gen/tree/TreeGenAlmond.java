package gaiasbounty.world.gen.tree;

import gaiasbounty.block.BlockManager;
import gaiasbounty.world.gen.shape.ShapeGenTreeTropicalFlat;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TreeGenAlmond extends WorldGenerator
{
   @Override
   public boolean generate(World world, Random rand, int x, int y, int z)
   {
      return ShapeGenTreeTropicalFlat.instance.generate(world, rand, x, y, z,
               BlockManager.logs4, 3, BlockManager.leaves4, 3);
   }
}
