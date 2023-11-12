package de.zonlykroks.xlfoodmod.blocks;

import de.zonlykroks.xlfoodmod.XLFoodMod;
import net.minecraft.block.CropBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CropBlocks {

    {

    }

    private void registerBlock(String name, CropBlock cropBlock) {
        Registry.register(Registries.BLOCK, new Identifier(XLFoodMod.MODID, name),cropBlock);
    }
}
