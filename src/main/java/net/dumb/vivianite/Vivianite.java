package net.dumb.vivianite;

import net.dumb.vivianite.block.ModBlocks;
import net.dumb.vivianite.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vivianite implements ModInitializer {
	public static final String MOD_ID = "vivianite";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("The gem of mortals");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
