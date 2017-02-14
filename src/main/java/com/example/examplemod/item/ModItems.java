package com.example.examplemod.item;

import com.example.examplemod.NewMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by GAMEON on 2/14/2017.
 */
public class ModItems
{
    public static Item item;

    public static void preInit()
    {
        item = new ItemNewItem("new_item1");

        registerItems();
    }

    public static void registerItems()
    {
        GameRegistry.register(item, new ResourceLocation(NewMod.MODID, "new_item1"));
    }

    public static void registerRenders()
    {
        registerRender(item);
    }

    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(NewMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
