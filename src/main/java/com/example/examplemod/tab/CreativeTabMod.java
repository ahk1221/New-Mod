package com.example.examplemod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by GAMEON on 2/14/2017.
 */
public class CreativeTabMod extends CreativeTabs{

    public CreativeTabMod(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.ENDER_EYE);
    }
}
