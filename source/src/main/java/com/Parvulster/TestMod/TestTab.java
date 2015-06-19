package com.Parvulster.TestMod;

import com.Parvulster.TestMod.init.TestItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestTab extends CreativeTabs{ //Name of class depends on mod
	public TestTab(String label) {
		super(label);
	}
	@Override
	public Item getTabIconItem() {
		return TestItems.test_item; //Item to show up on tab
	}
}
