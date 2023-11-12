package de.zonlykroks.xlfoodmod.blocks;

import de.zonlykroks.xlfoodmod.XLFoodMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class RockSaltBlock extends Block {
    public RockSaltBlock() {
        super(Settings.copy(Blocks.STONE).hardness(1.5F).resistance(1.5F).sounds(BlockSoundGroup.STONE));
        Registry.register(Registries.ITEM, new Identifier(XLFoodMod.MODID, "rock_salt"), new AliasedBlockItem(this, new Item.Settings()));
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        if(!dropExperience) return;

        int exp = new Random().nextInt(0,2);
        ExperienceOrbEntity experienceOrbEntity = new ExperienceOrbEntity(world,pos.getX(),pos.getY(),pos.getZ(), exp);
        world.spawnEntity(experienceOrbEntity);
    }
}
