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

// $Id: MMVisitor.java 1275 2010-02-09 15:33:16Z lhamann $

package org.tzi.use.uml.mm;


/**
 * Visitor interface for model elements.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author      Mark Richters 
 */
public interface MMVisitor {
    void visitAssociation(MAssociation e);
    void visitAssociationClass( MAssociationClass e );
    void visitAssociationEnd(MAssociationEnd e);
    void visitAttribute(MAttribute e);
    void visitClass(MClass e);
    void visitClassInvariant(MClassInvariant e);
    void visitGeneralization(MGeneralization e);
    void visitModel(MModel e);
    void visitOperation(MOperation e);
    void visitPrePostCondition(MPrePostCondition e);
}
