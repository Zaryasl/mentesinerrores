package com.example.zaryaentity.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class inititems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "zaryaentity");
    public static final RegistryObject <Item> RAMEN = ITEMS.register(
            "ramen", () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().alwaysEat().build())
            )
    );}