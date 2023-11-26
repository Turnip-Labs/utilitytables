package luke.utilitytables;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.world.World;

public class BlockCutter extends Block {
	public BlockCutter(String key, int id) {
		super(key, id, Material.stone);
	}

	@Override
	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
		if (!world.isClientSide) {
			player.displayGUIWorkbench(x, y, z);
		}
		return true;
	}
}
