package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IconRegister;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemMunny3000 extends ItemKingdomKeys{

    public ItemMunny3000(int id) {
        super(id);       
        this.setUnlocalizedName(Strings.Munny3000); 
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}