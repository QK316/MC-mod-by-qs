package com.lzzkill.quenching;

import com.lzzkill.quenching.block.Blocks;
import com.lzzkill.quenching.item.Items;
import com.lzzkill.quenching.utils.QuenchingGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Quenching.MODID)
public class Quenching
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "quenching";
    public static final QuenchingGroup QUENCHING_GROUP = new QuenchingGroup();

    public Quenching()
    {
        Blocks.DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
        Items.DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }
}
