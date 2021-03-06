package gaiasbounty.block;

import java.util.List;

import gaiasbounty.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockPlanks extends Block
{
   public String[] woodTypes;
   
   @SideOnly(Side.CLIENT)
   private IIcon[] iconArray;
   
   public BlockPlanks(String ... woodNames)
   {
      super(Material.wood);
      this.setHardness(2.0F);
      this.setResistance(5.0F);
      this.setStepSound(soundTypeWood);
      this.woodTypes = woodNames;
   }
   
   @Override
   public int damageDropped(int meta)
   {
      return meta;
   }
   
   @Override
   public IIcon getIcon(int side, int meta)
   {
      return this.iconArray[meta];
   }
   
   @Override
   @SideOnly(Side.CLIENT)
   public void getSubBlocks(Item item, CreativeTabs tabs, List list)
   {
      for (int i = 0; i < this.woodTypes.length; i++)
         list.add(new ItemStack(item, 1, i));
   }
   
   @Override
   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister icons)
   {
      this.iconArray = new IIcon[woodTypes.length];
      
      for (int i = 0; i < woodTypes.length; i++)
      {
         this.iconArray[i] = icons.registerIcon(Reference.GB_TEX_PREFIX
                  + "plank_" + woodTypes[i]);
      }
   }
}
