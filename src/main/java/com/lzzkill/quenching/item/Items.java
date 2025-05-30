package com.lzzkill.quenching.item;

import com.lzzkill.quenching.Quenching;
import com.lzzkill.quenching.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items
{

    public static final DeferredRegister<Item> DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Quenching.MODID);

    public static final RegistryObject<Item> REFINED_IRON_INGOT = DEFERRED_REGISTER.register("refined_iron_ingot", () -> new Item(new Item.Properties().tab(Quenching.QUENCHING_GROUP)));
    public static final RegistryObject<Item> ALUMINUM_INGOT = DEFERRED_REGISTER.register("aluminum_ingot", () -> new Item(new Item.Properties().tab(Quenching.QUENCHING_GROUP)));
    public static final RegistryObject<Item> ZINC_INGOT = DEFERRED_REGISTER.register("zinc_ingot", () -> new Item(new Item.Properties().tab(Quenching.QUENCHING_GROUP)));
    public static final RegistryObject<Item> COPPER_INGOT = DEFERRED_REGISTER.register("copper_ingot", () -> new Item(new Item.Properties().tab(Quenching.QUENCHING_GROUP)));

    public static final RegistryObject<BlockItem> REFINED_IRON_BLOCK = DEFERRED_REGISTER.register("refined_iron_block.json", () -> new BlockItem(Blocks.REFINED_IRON_BLOCK.get(), new Item.Properties().tab(Quenching.QUENCHING_GROUP)));
    public static final RegistryObject<BlockItem> ALUMINUM_BLOCK = DEFERRED_REGISTER.register("aluminum_block", () -> new BlockItem(Blocks.ALUMINUM_BLOCK.get(), new Item.Properties().tab(Quenching.QUENCHING_GROUP)));
    public static final RegistryObject<BlockItem> ZINC_BLOCK = DEFERRED_REGISTER.register("zinc_block", () -> new BlockItem(Blocks.ZINC_BLOCK.get(), new Item.Properties().tab(Quenching.QUENCHING_GROUP)));
    public static final RegistryObject<BlockItem> COPPER_BLOCK = DEFERRED_REGISTER.register("copper_block", () -> new BlockItem(Blocks.COPPER_BLOCK.get(), new Item.Properties().tab(Quenching.QUENCHING_GROUP)));

}
