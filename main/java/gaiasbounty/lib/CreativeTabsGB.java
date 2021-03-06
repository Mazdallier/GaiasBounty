package gaiasbounty.lib;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gaiasbounty.block.BlockManager;
import gaiasbounty.item.ItemManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsGB
{
   public static final CreativeTabs PLANT = new CreativeTabs(
            CreativeTabs.getNextID(), "gaiasbounty.creative.plant")
   {
      @Override
      public Item getTabIconItem()
      {
         return Item.getItemFromBlock(BlockManager.saplings1);
      }

      @Override
      public int func_151243_f()
      {
          return 0;
      }
   };
   
   public static final CreativeTabs FOOD = new CreativeTabs(
            CreativeTabs.getNextID(), "gaiasbounty.creative.food")
   {
      @Override
      public Item getTabIconItem()
      {
         return ItemManager.foodCrop;
      }

      @Override
      public int func_151243_f()
      {
          return 24;
      }
   };
   
   public static final CreativeTabs MISC = new CreativeTabs(
            CreativeTabs.getNextID(), "gaiasbounty.creative.misc")
   {
      @Override
      public Item getTabIconItem()
      {
         return ItemManager.material;
      }

      @Override
      public int func_151243_f()
      {
          return 1;
      }
   };
}
