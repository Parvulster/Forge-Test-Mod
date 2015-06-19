package com.Parvulster.TestMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.Parvulster.TestMod.init.TestBlocks;
import com.Parvulster.TestMod.init.TestItems;
import com.Parvulster.TestMod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION) //Put info in Reference
public class TestMod {
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS) //Put info in Reference
	public static CommonProxy proxy; //Same for all mods
	public static final TestTab tabTest = new TestTab("tabTest"); //Change based on mod
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) { //Put these things here for every mod
		TestBlocks.init();
		TestBlocks.register();
		TestItems.init();
		TestItems.register();
	}
	@EventHandler
	public void init(FMLInitializationEvent event) { //Put this here for every mod
			proxy.registerRenders();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) { //idk
		
	}
}
