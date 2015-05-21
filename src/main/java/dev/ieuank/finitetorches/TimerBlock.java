package dev.ieuank.finitetorches;

import net.minecraft.block.material.Material;

public class TimerBlock
{
	private Material material;
	private Integer placeTime;
	private Integer maxLife;
	
	/**
	 * TimerBlock containing Material, Time and placeTime
	 * @param m 	Material material
	 * @param pT 	Integer placeTime
	 * @param mL	Integer maxLife
	 */
	public TimerBlock(Material m, Integer pT, Integer mL) {
		this.setMaterial(m);
		this.setPlaceTime(pT);
		this.setMaxLife(mL);
	}

	public Material getMaterial()
	{
		return material;
	}

	public void setMaterial(Material material)
	{
		this.material = material;
	}

	public Integer getPlaceTime()
	{
		return placeTime;
	}

	public void setPlaceTime(Integer placeTime)
	{
		this.placeTime = placeTime;
	}

	public Integer getMaxLife()
	{
		return maxLife;
	}

	public void setMaxLife(Integer maxLife)
	{
		this.maxLife = maxLife;
	}
	
	
}
