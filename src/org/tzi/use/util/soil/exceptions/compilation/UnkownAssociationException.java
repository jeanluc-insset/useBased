/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

// $Id: UnkownAssociationException.java 1734 2010-09-07 14:56:17Z lhamann $

package org.tzi.use.util.soil.exceptions.compilation;

import org.tzi.use.parser.soil.ast.ASTStatement;
import org.tzi.use.util.StringUtil;


/**
 * TODO
 * @author Daniel Gent
 *
 */
public class UnkownAssociationException extends CompilationFailedException {
	/** TODO */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * TODO
	 * @param statement
	 * @param associationName
	 */
	public UnkownAssociationException(
			ASTStatement statement, 
			String associationName) {
		
		super(
			statement, 
			"Association " +
			StringUtil.inQuotes(associationName) +
			" does not exist.");
	}
}
