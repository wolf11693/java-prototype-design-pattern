package com.ra.pattern.prototype.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.ra.pattern.prototype.ComputerPrototype;
import com.ra.pattern.prototype.ComputerType;
import com.ra.pattern.prototype.Desktop;
import com.ra.pattern.prototype.Laptop;
import com.ra.pattern.prototype.Server;

public class ComputerPrototypeFactoryImpl implements ComputerPrototypeFactory{

	private Map<ComputerType, ComputerPrototype> prototypes;
	
	public ComputerPrototypeFactoryImpl() {
		super();
		this.buildPrototypes();
	}

	public Map<ComputerType, ComputerPrototype> getPrototypes() {
		return this.prototypes;
	}

	public void setPrototypes(Map<ComputerType, ComputerPrototype> prototypes) {
		this.prototypes = prototypes;
		
		
	}
	
	private void buildPrototypes() {
		if(this.prototypes == null) {
			Map<ComputerType, ComputerPrototype> prototypes = new HashMap<ComputerType, ComputerPrototype>();

			prototypes.put(ComputerType.DESKTOP, new Desktop("16GB", "1000 GB"));
			prototypes.put(ComputerType.LAPTOP, new Laptop("12GB", "250Gb"));
			prototypes.put(ComputerType.SERVER, new Server("128GB", "60000 GB"));

			this.prototypes = prototypes;
		}
	}
	
	@Override
	public ComputerPrototype getComputerProtype(ComputerType computerType) throws Exception {
		ComputerPrototype computerPrototype = null;
		
		ComputerPrototype protype = prototypes.get(computerType);
		if(protype == null) {
			throw new Exception("There are not prototypes to clone!");
		}
		
		switch (computerType) {
			case DESKTOP:
				computerPrototype = protype.clone();
				break;
	
			case LAPTOP:
				computerPrototype = protype.clone();
				break;
			
			case SERVER:
				computerPrototype = protype.clone();
				break;
	
			default:
				throw new UnsupportedOperationException(computerType + " is not valid computer type!");
			}
		
		return computerPrototype;
	}

}
