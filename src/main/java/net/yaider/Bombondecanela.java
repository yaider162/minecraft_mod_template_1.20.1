package net.yaider;

import net.fabricmc.api.ModInitializer;

import net.yaider.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bombondecanela implements ModInitializer {
	public static final String MOD_ID = "bombondecanela";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
	}
}