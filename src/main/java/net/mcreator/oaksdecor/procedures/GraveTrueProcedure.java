package net.mcreator.oaksdecor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.oaksdecor.init.OaksDecorModGameRules;

public class GraveTrueProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(OaksDecorModGameRules.DODEATHGRAVE) == true) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("gamerule doDeathGrave set False"), (false));
			if (world instanceof Level _level)
				_level.getGameRules().getRule(OaksDecorModGameRules.DODEATHGRAVE).set((false), _level.getServer());
		}
	}
}
