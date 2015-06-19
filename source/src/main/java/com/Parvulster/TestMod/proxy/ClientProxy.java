package com.Parvulster.TestMod.proxy;

import com.Parvulster.TestMod.init.TestBlocks;
import com.Parvulster.TestMod.init.TestItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() { //Put registerRender classes here
		TestItems.registerRenders();
		TestBlocks.registerRenders();
	}
}
