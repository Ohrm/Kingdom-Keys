package wehavecookies56.kk.item.keychains;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.ItemKingdomKeys;
import wehavecookies56.kk.item.keyblades.ItemFrolicFlame;
import wehavecookies56.kk.lib.Reference;

public class ItemFrolicFlameChain extends ItemKingdomKeys{
	
    public ItemFrolicFlameChain(int id) {
        super(id);       
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    EntityPlayer player = (EntityPlayer)par3Entity;
    if (ItemFrolicFlame.keyPressed)
    {
    	ItemFrolicFlame.keyPressed = false;
            if (player.getHeldItem() != null && player.getHeldItem().itemID == AddedItems.K25c.itemID)
            {
      player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(AddedItems.K25));
    }
    }
    }
}