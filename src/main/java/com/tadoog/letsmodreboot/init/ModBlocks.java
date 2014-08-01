package com.tadoog.letsmodreboot.init;

import com.tadoog.letsmodreboot.block.BlockFlag;
import com.tadoog.letsmodreboot.block.BlockFlagCanada;
import com.tadoog.letsmodreboot.block.BlockLMRB;
import com.tadoog.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();
    public static final BlockLMRB canada_flag = new BlockFlagCanada();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(canada_flag, "canada_flag");
    }
}
