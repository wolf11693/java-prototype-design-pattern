package com.ra.pattern.prototype;

public abstract class ComputerConcretePrototype implements ComputerPrototype {

	private String ram;
	private String extMemoryCapacity;
	
	public ComputerConcretePrototype() {
		this(null, null);
	}
	
	public ComputerConcretePrototype(String ram, String extMemoryCapacity) {
		super();
		this.ram = ram;
		this.extMemoryCapacity = extMemoryCapacity;
	}
	
	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getExtMemoryCapacity() {
		return extMemoryCapacity;
	}

	public void setExtMemoryCapacity(String extMemoryCapacity) {
		this.extMemoryCapacity = extMemoryCapacity;
	}

	@Override
	public ComputerPrototype clone() {
		ComputerPrototype clonedObj = null;
		
		try {
			clonedObj = (ComputerPrototype) super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println("Something went wrong!");
			ex.printStackTrace();
		}
		
		return clonedObj;
	}
	
	public abstract ComputerType getComputerType();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ComputerConcretePrototype [ram=");
		builder.append(ram);
		builder.append(", extMemoryCapacity=");
		builder.append(extMemoryCapacity);
		builder.append("]");
		return builder.toString();
	}
}