package com.specmate.model.support.commands;

import org.eclipse.emf.ecore.EObject;

import com.specmate.common.SpecmateException;
import com.specmate.model.support.util.SpecmateEcoreUtil;

public class GenericDeleteCommand implements ICommand {

	private EObject toDelete;

	public GenericDeleteCommand(EObject toDelete) {
		this.toDelete = toDelete;
	}

	@Override
	public void execute() throws SpecmateException {
		SpecmateEcoreUtil.detach(this.toDelete);
	}

}
