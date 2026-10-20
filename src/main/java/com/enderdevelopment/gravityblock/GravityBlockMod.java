package com.enderdevelopment.gravityblock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GravityBlockMod {
    public static final String MODID = "gravityblock";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> GRAVITY_BLOCK = BLOCKS.register("gravity_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f)));

    public static void init() {
        // Initialize the mod
    }
}