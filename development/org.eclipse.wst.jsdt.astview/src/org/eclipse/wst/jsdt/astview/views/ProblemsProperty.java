/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.jsdt.astview.views;

import org.eclipse.swt.graphics.Image;

import org.eclipse.wst.jsdt.core.compiler.IProblem;
import org.eclipse.wst.jsdt.core.dom.JavaScriptUnit;

/**
 *
 */
public class ProblemsProperty extends ASTAttribute {
	
	private final JavaScriptUnit fRoot;

	public ProblemsProperty(JavaScriptUnit root) {
		fRoot= root;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.wst.jsdt.astview.views.ASTAttribute#getParent()
	 */
	public Object getParent() {
		return fRoot;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.wst.jsdt.astview.views.ASTAttribute#getChildren()
	 */
	public Object[] getChildren() {
		IProblem[] problems= fRoot.getProblems();
		Object[] res= new Object[problems.length];
		for (int i= 0; i < res.length; i++) {
			res[i]= new ProblemNode(this, problems[i]);
		}
		return res;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.wst.jsdt.astview.views.ASTAttribute#getLabel()
	 */
	public String getLabel() {
		return "> compiler problems (" +  fRoot.getProblems().length + ")";  //$NON-NLS-1$//$NON-NLS-2$
	}

	/* (non-Javadoc)
	 * @see org.eclipse.wst.jsdt.astview.views.ASTAttribute#getImage()
	 */
	public Image getImage() {
		return null;
	}

	/*
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || !obj.getClass().equals(getClass())) {
			return false;
		}
		return true;
	}
	
	/*
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return 18;
	}
}
