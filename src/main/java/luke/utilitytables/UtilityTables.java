package luke.utilitytables;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.sound.block.BlockSound;
import net.minecraft.core.block.*;
import net.minecraft.core.block.tag.BlockTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;


public class UtilityTables implements ModInitializer {
    public static final String MOD_ID = "utilitytables";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Blocks

	public static final Block cutter = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
		.setHardness(3.5f)
		.setResistance(3.5f)
		.setNorthTexture("cutterside.png")
		.setSideTextures(13, 2)
		.setTopTexture("cuttertop.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CHAINLINK_FENCES_CONNECT)
		.build(new BlockCutter("cutter", 651));


    @Override
    public void onInitialize() {
        LOGGER.info("UtilityTables initialized.");
    }
}
