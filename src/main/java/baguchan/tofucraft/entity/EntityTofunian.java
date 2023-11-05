package baguchan.tofucraft.entity;

import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.world.World;

public class EntityTofunian extends EntityAnimal {
	public EntityTofunian(World world) {
		super(world);
		this.scoreValue = 0;
		this.health = 20;
		this.heightOffset = 0.0F;
		this.footSize = 0.5F;
		this.moveSpeed = 0.24F;
		this.highestSkinVariant = -1;
		this.setSize(0.6F, 1.15F);
		this.setPos(this.x, this.y, this.z);
		this.skinName = "tofunian";
	}

	@Override
	public String getEntityTexture() {
		return "/assets/tofucraft/entity/tofunian/tofunian.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/tofucraft/entity/tofunian/tofunian.png";
	}

	@Override
	protected String getLivingSound() {
		return "mob.tofunian.ambient";
	}

	@Override
	protected String getHurtSound() {
		return "mob.tofunian.hurt";
	}

	@Override
	protected String getDeathSound() {
		return "mob.tofunian.death";
	}

	protected boolean canDespawn() {
		return false;
	}
}
