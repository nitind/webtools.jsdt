/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.jsdt.debug.opera.internal.jsdi.request;

import org.eclipse.wst.jsdt.debug.core.jsdi.request.ScriptLoadRequest;
import org.eclipse.wst.jsdt.debug.opera.internal.jsdi.VirtualMachineImpl;

/**
 * Default {@link ScriptLoadRequest} implementation for Opera
 * 
 * @since 0.1
 */
public class ScriptLoadRequestImpl extends EventRequestImpl implements ScriptLoadRequest {

	/**
	 * Constructor
	 * @param vm
	 */
	public ScriptLoadRequestImpl(VirtualMachineImpl vm) {
		super(vm);
	}
}
