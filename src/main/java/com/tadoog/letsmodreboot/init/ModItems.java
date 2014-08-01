package com.tadoog.letsmodreboot.init;

import com.tadoog.letsmodreboot.item.ItemAdamantiumIngot;
import com.tadoog.letsmodreboot.item.ItemLMRB;
import com.tadoog.letsmodreboot.item.ItemMapleLeaf;
import com.tadoog.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
    public static final ItemLMRB adamantiumIngot = new ItemAdamantiumIngot();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(adamantiumIngot, "adamantiumIngot");
    }
}
