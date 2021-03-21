package com.ra.pattern.prototype;

public class Server extends ComputerConcretePrototype {

	public Server(String ram, String extMemoryCapacity) {
		super(ram, extMemoryCapacity);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Server [ram=");
		builder.append(this.getRam());
		builder.append(", extMemoryCapacity=");
		builder.append(this.getExtMemoryCapacity());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public ComputerType getComputerType() {
		return ComputerType.SERVER;
	}
}