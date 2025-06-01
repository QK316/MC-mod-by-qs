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

    public static final RegistryObject<Item> REFINED_IRON_INGOT = getDefaultItem("refined_iron_ingot");
    public static final RegistryObject<Item> ALUMINUM_INGOT = getDefaultItem("aluminum_ingot");
    public static final RegistryObject<Item> ZINC_INGOT = getDefaultItem("zinc_ingot");
    public static final RegistryObject<Item> COPPER_INGOT = getDefaultItem("copper_ingot");

    public static final RegistryObject<Item> SULFUR = getDefaultItem("sulfur");
    public static final RegistryObject<Item> GLASS_FRIT = getDefaultItem("glass_frit");
    public static final RegistryObject<Item> CARBON_STICK = getDefaultItem("carbon_stick");
    public static final RegistryObject<Item> LOW_CARBON_STEEL = getDefaultItem("low_carbon_steel");
    public static final RegistryObject<Item> HIGH_CARBON_STEEL = getDefaultItem("high_carbon_steel");
    public static final RegistryObject<Item> PIG_IRON = getDefaultItem("pig_iron");
    public static final RegistryObject<Item> GRAPHITE = getDefaultItem("graphite");
    public static final RegistryObject<Item> CARBON = getDefaultItem("carbon");

    public static final RegistryObject<BlockItem> REFINED_IRON_BLOCK = DEFERRED_REGISTER.register("refined_iron_block", () -> new BlockItem(Blocks.REFINED_IRON_BLOCK.get(), DEFAULT_PROPERTIES));
    public static final RegistryObject<BlockItem> ALUMINUM_BLOCK = DEFERRED_REGISTER.register("aluminum_block", () -> new BlockItem(Blocks.ALUMINUM_BLOCK.get(), DEFAULT_PROPERTIES));
    public static final RegistryObject<BlockItem> ZINC_BLOCK = DEFERRED_REGISTER.register("zinc_block", () -> new BlockItem(Blocks.ZINC_BLOCK.get(), DEFAULT_PROPERTIES));
    public static final RegistryObject<BlockItem> COPPER_BLOCK = DEFERRED_REGISTER.register("copper_block", () -> new BlockItem(Blocks.COPPER_BLOCK.get(), DEFAULT_PROPERTIES));

    public static final RegistryObject<BlockItem> ALUMINUM_ORE = DEFERRED_REGISTER.register("aluminum_ore", () -> new BlockItem(Blocks.ALUMINUM_ORE.get(), DEFAULT_PROPERTIES));
    public static final RegistryObject<BlockItem> ZINC_ORE = DEFERRED_REGISTER.register("zinc_ore", () -> new BlockItem(Blocks.ZINC_ORE.get(), DEFAULT_PROPERTIES));
    public static final RegistryObject<BlockItem> COPPER_ORE = DEFERRED_REGISTER.register("copper_ore", () -> new BlockItem(Blocks.COPPER_ORE.get(), DEFAULT_PROPERTIES));

    private static RegistryObject<Item> getDefaultItem(final String name)
    {
        return DEFERRED_REGISTER.register(name, () -> new Item(DEFAULT_PROPERTIES));
    }

}
