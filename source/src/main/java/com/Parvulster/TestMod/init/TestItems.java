package com.Parvulster.TestMod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.Parvulster.TestMod.Reference;
import com.Parvulster.TestMod.TestMod;

public class TestItems {
	public static Item test_item; //List all items like this
	public static Item test_food;
	public static void init() {
		test_item = new Item().setUnlocalizedName("test_item").setCreativeTab(TestMod.tabTest); //And this
		test_food = new ItemFood(20, 1.0F, true);
	}
	public static void register() {
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5)); //And this
		GameRegistry.registerItem(test_food, test_food.getUnlocalizedName().substring(5));
	}
	public static void registerRenders() {
		registerRender(test_item); //And this
		registerRender(test_food);
	}
	public static void  registerRender(Item item) { //Same for every mod
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
