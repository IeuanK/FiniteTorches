package dev.ieuank.finitetorches.entities.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;

public class TileEntityLitTorch extends TileEntity
{
	private Integer ticksLeft;
	
	public void tickDown() {
		this.ticksLeft--;
	}
	
	public void setTicks(int ticks) {
		this.ticksLeft = ticks;
	}
	
	public Integer getTicksLeft() {
		return this.ticksLeft;
	}
	
	public void writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("ticksLeft", this.ticksLeft);
		super.writeToNBT(nbt);
	}
	
	public void readFromNBT(NBTTagCompound nbt) {
		this.ticksLeft = nbt.getInteger("ticksLeft");
		super.readFromNBT(nbt);
	}
	
	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		//return new Packet132TileEntityData(xCoord, yCoord, zCoord, 1, nbt);
		return null;
	}
}
