package com.lzzkill.quenching.utils;

import com.lzzkill.quenching.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class QuenchingGroup extends ItemGroup
{

    public QuenchingGroup()
    {
        super("quenching_group");
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(Items.ALUMINUM_INGOT.get());
    }
}
