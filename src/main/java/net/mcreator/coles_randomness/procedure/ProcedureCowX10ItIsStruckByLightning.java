package net.mcreator.coles_randomness.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureCowX10ItIsStruckByLightning extends ElementsColesRandomnessMod.ModElement {
	public ProcedureCowX10ItIsStruckByLightning(ElementsColesRandomnessMod instance) {
		super(instance, 322);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CowX10ItIsStruckByLightning!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "summon coles_randomness:cowx10 ~ ~ ~");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "summon coles_randomness:cowx10 ~ ~ ~");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "summon coles_randomness:cowx10 ~ ~ ~");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "summon coles_randomness:cowx10 ~ ~ ~");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "summon coles_randomness:cowx10 ~ ~ ~");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "summon coles_randomness:cowx10 ~ ~ ~");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "summon coles_randomness:cowx10 ~ ~ ~");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "summon coles_randomness:cowx10 ~ ~ ~");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "summon coles_randomness:cowx10 ~ ~ ~");
			}
		}
	}
}
