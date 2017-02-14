package com.example.examplemod;

import com.example.examplemod.item.ModItems;
import com.example.examplemod.proxy.CommonProxy;
import com.example.examplemod.tab.CreativeTabMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by AHK1221 on 2/14/2017.
 */

@Mod(modid = NewMod.MODID, version = NewMod.VERSION, name = NewMod.NAME)
public class NewMod
{
    public static final String MODID = "nmod";
    public static final String VERSION = "0.1";
    public static final String NAME = "AHK1221's MOD!";

    @SidedProxy(clientSide = "com.example.examplemod.proxy.ClientProxy", serverSide = "com.example.examplemod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static NewMod instance;

    public static CreativeTabMod creativeTabMod;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        creativeTabMod = new CreativeTabMod(CreativeTabs.getNextID(), "tab_newmod");
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
