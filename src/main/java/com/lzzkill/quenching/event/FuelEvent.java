package com.lzzkill.quenching.event;

import com.lzzkill.quenching.item.Items;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class FuelEvent
{
    @SubscribeEvent
    public static void onFuelCheck(FurnaceFuelBurnTimeEvent event)
    {
        if(event.getItemStack().getItem() == Items.SULFUR.get())
        {
            event.setBurnTime(160);
        }
    }
}
