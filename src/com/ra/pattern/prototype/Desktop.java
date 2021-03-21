package com.ra.pattern.prototype;

public class Desktop extends ComputerConcretePrototype {

	public Desktop(String ram, String extMemoryCapacity) {
		super(ram, extMemoryCapacity);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Desktop [ram=");
		builder.append(this.getRam());
		builder.append(", extMemoryCapacity=");
		builder.append(this.getExtMemoryCapacity());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public ComputerType getComputerType() {
		return ComputerType.DESKTOP;
	}
}