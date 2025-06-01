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

    public static final Item.Properties DEFAULT_PROPERTIES = new Item.Properties().tab(Quenching.QUENCHING_GROUP);

    public static final DeferredRegister<Item> DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Quenching.MODID);

    public static final RegistryObject<Item> REFINED_IRON_INGOT = DEFERRED_REGISTER.register("refined_iron_ingot", () -> new Item(DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> ALUMINUM_INGOT = DEFERRED_REGISTER.register("aluminum_ingot", () -> new Item(DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> ZINC_INGOT = DEFERRED_REGISTER.register("zinc_ingot", () -> new Item(DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> COPPER_INGOT = DEFERRED_REGISTER.register("copper_ingot", () -> new Item(DEFAULT_PROPERTIES));

    public static final RegistryObject<Item> SULFUR = DEFERRED_REGISTER.register("sulfur", () -> new Item(DEFAULT_PROPERTIES));

    public static final RegistryObject<BlockItem> REFINED_IRON_BLOCK = DEFERRED_REGISTER.register("refined_iron_block", () -> new BlockItem(Blocks.REFINED_IRON_BLOCK.get(), DEFAULT_PROPERTIES));
    public static final RegistryObject<BlockItem> ALUMINUM_BLOCK = DEFERRED_REGISTER.register("aluminum_block", () -> new BlockItem(Blocks.ALUMINUM_BLOCK.get(), DEFAULT_PROPERTIES));
    public static final RegistryObject<BlockItem> ZINC_BLOCK = DEFERRED_REGISTER.register("zinc_block", () -> new BlockItem(Blocks.ZINC_BLOCK.get(), DEFAULT_PROPERTIES));
    public static final RegistryObject<BlockItem> COPPER_BLOCK = DEFERRED_REGISTER.register("copper_block", () -> new BlockItem(Blocks.COPPER_BLOCK.get(), DEFAULT_PROPERTIES));

    public static final RegistryObject<BlockItem> ALUMINUM_ORE = DEFERRED_REGISTER.register("aluminum_ore", () -> new BlockItem(Blocks.ALUMINUM_ORE.get(), DEFAULT_PROPERTIES));
    public static final RegistryObject<BlockItem> ZINC_ORE = DEFERRED_REGISTER.register("zinc_ore", () -> new BlockItem(Blocks.ZINC_ORE.get(), DEFAULT_PROPERTIES));
    public static final RegistryObject<BlockItem> COPPER_ORE = DEFERRED_REGISTER.register("copper_ore", () -> new BlockItem(Blocks.COPPER_ORE.get(), DEFAULT_PROPERTIES));

}
