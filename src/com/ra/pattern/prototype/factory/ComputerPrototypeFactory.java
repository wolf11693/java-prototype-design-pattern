package com.ra.pattern.prototype.factory;

import com.ra.pattern.prototype.ComputerPrototype;
import com.ra.pattern.prototype.ComputerType;

public interface ComputerPrototypeFactory {

	public ComputerPrototype getComputerProtype(ComputerType computerType) throws Exception;
}
