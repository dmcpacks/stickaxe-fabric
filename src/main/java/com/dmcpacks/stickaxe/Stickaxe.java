package com.dmcpacks.stickaxe;

import com.dmcpacks.stickaxe.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Stickaxe implements ModInitializer {

	public static final String MOD_ID = "stickaxe";

	public static final Logger LOGGER = LogManager.getLogger("stickaxe");

	@Override
	public void onInitialize() {

		LOGGER.info("Loading data");
		ModItems.registerModItems();
		LOGGER.info("Fully registered");
	}
}
