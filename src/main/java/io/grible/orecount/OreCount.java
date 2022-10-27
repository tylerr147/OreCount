package io.grible.orecount;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OreCount implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("orecount");

	@Override
	public void onInitialize() {
		LOGGER.info("Initialized");
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

	}
}
