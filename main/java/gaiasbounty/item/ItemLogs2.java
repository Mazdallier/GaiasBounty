package gaiasbounty.item;

import net.minecraft.block.Block;
import gaiasbounty.block.BlockManager;
import gaiasbounty.lib.Reference;

public class ItemLogs2 extends ItemMultiBlock
{
   public ItemLogs2(Block block)
   {
      super(block);
      subNames = BlockManager.tree2Subtypes;
      setUnlocalizedName(Reference.GB_NAME_PREFIX + "logs2");
   }
}
