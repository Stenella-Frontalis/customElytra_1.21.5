package wisteria.customelytra.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

//use ElytraLayerRenderer??
//override with a mixin??

//probably does nothing right now

public class ModElytraItem extends Item implements FabricElytraItem{


    public ModElytraItem(Settings settings) {
        super(settings);
    }
}