package net.mcreator.oaksdecor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.oaksdecor.init.OaksDecorModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class TargetStageChangingProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("oaks_decor:target")))) {
			if (OaksDecorModBlocks.OAK_TARGET_STAGE_0.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.OAK_TARGET_STAGE_1.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.ACACIA_TARGET_STAGE_0.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.ACACIA_TARGET_STAGE_1.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.BIRCH_TARGET_STAGE_0.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.BIRCH_TARGET_STAGE_1.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.DARK_OAK_TARGET_STAGE_0.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.DARK_OAK_TARGET_STAGE_1.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.JUNGLE_TARGET_STAGE_0.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.JUNGLE_TARGET_STAGE_1.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.MANGROVE_TARGET_STAGE_0.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.MANGROVE_TARGET_STAGE_1.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.SPRUCE_TARGET_STAGE_0.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.SPRUCE_TARGET_STAGE_1.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.OAK_TARGET_STAGE_1.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.OAK_TARGET_STAGE_0.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.ACACIA_TARGET_STAGE_1.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.ACACIA_TARGET_STAGE_0.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.BIRCH_TARGET_STAGE_1.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.BIRCH_TARGET_STAGE_0.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.DARK_OAK_TARGET_STAGE_1.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.DARK_OAK_TARGET_STAGE_0.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.JUNGLE_TARGET_STAGE_1.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.JUNGLE_TARGET_STAGE_0.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.MANGROVE_TARGET_STAGE_1.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.MANGROVE_TARGET_STAGE_0.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (OaksDecorModBlocks.SPRUCE_TARGET_STAGE_1.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = OaksDecorModBlocks.SPRUCE_TARGET_STAGE_0.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
