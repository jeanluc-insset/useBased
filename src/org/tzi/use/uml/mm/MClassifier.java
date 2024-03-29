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

// $Id$

package org.tzi.use.uml.mm;

/**
 * Interface representing a classifier of
 * the UML meta model.
 * 
 * TODO: UML meta model defines generalization etc. on classifier 
 * @author lhamann
 *
 */
public interface MClassifier extends MNamedElement {
	/**
	 * If true, the Classifier does not provide a complete declaration and can typically not be instantiated.
	 * An abstract classifier is intended to be used by other classifiers (e.g., as the target of general 
	 * metarelationships or generalization relationships). Default value is false. [UML 2.3, p. 53]
	 * @return
	 */
	boolean isAbstract();
}
