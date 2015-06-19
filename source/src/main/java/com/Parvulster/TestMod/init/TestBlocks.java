package com.Parvulster.TestMod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.Parvulster.TestMod.Reference;
import com.Parvulster.TestMod.TestMod;
import com.Parvulster.TestMod.blocks.BlockClass;

public class TestBlocks {
	public static Block test_block; //List all blocks like this
	public static void init() {//And this
		test_block = new BlockClass(Material.sponge).setUnlocalizedName("test_block").setCreativeTab(TestMod.tabTest);
	}
	public static void register() { //And this
		GameRegistry.registerBlock(test_block, test_block.getUnlocalizedName().substring(5));
	}
	public static void registerRenders() { //And this
		registerRender(test_block);
	}
	public static void registerRender(Block block) { //Same for all mods
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
