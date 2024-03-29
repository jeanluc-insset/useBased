/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
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

// $Id: ObjectType.java 2576 2011-10-05 10:02:51Z lhamann $

package org.tzi.use.uml.ocl.type;

import java.util.LinkedList;
import java.util.List;

import org.tzi.use.uml.mm.MClass;

/**
 * Type of objects. Object types are defined by the class of the object.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
public final class ObjectType extends Type {
    private MClass fClass;

    /**
     * Should only be called by MClass 
     * @param cls
     */
    public ObjectType(MClass cls) {
        fClass = cls;
    }
    
    public MClass cls() {
        return fClass;
    }
    
    public boolean isTrueObjectType() {
    	return true;
    }
    
    public boolean isObjectType() {
    	return true;
    }
    
    /** 
     * Test subtype relation between this and <code>t</code>. 
     */
    public boolean isSubtypeOf(Type t) {
        if (t.isTrueObjectType() ) {
            MClass cls2 = ((ObjectType) t).cls();
            return fClass.isSubClassOf(cls2);
        }
        return t.isTrueOclAny();
    }

    /** 
     * Return complete printable type name, e.g. 'Set(Bag(Integer))'. 
     */
    @Override
    public StringBuilder toString(StringBuilder sb) {
        return sb.append(fClass.name());
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this )
            return true;
        if (obj.getClass().equals(getClass()))
            return fClass.equals(((ObjectType) obj).fClass);
        return false;
    }

    public int hashCode() {
        return fClass.hashCode();
    }

	/* (non-Javadoc)
	 * @see org.tzi.use.uml.ocl.type.Type#initOrderedSuperTypes(java.util.List)
	 */
	@Override
	protected void getOrderedSuperTypes(List<Type> allSupertypes) {
        List<MClass> todo = new LinkedList<MClass>(fClass.parents());
        
        while (!todo.isEmpty()) {
        	MClass cls = todo.remove(0);
        	allSupertypes.add(TypeFactory.mkObjectType(cls));
            todo.addAll(cls.parents());
        }
        
        allSupertypes.add(TypeFactory.mkOclAny());
	}
    
}
