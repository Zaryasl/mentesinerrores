package com.example.zaryaentity.init;

import com.example.zaryaentity.zaryaentity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockIniciar {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, zaryaentity.MODID);

    public static final RegistryObject<Block> bloquezarya = register("bloquezarya",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).friction(0.5f).strength(5f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    private static <T extends Block> RegistryObject<T> register(
            String name,
            Supplier<T> supplier,
            Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        inititems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}