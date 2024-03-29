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

// $Id: LinkDeletedEvent.java 1734 2010-09-07 14:56:17Z lhamann $

package org.tzi.use.uml.sys.events;

import java.util.List;

import org.tzi.use.uml.mm.MAssociation;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.soil.MStatement;


/**
 * TODO
 * @author Daniel Gent
 *
 */
public class LinkDeletedEvent extends Event {
	/** TODO */
	private MAssociation fAssociation;
	/** TODO */
	private List<MObject> fParticipants;

	
	/**
	 * TODO
	 * @param creator
	 * @param association
	 * @param participants
	 */
	public LinkDeletedEvent(
			MStatement creator, 
			MAssociation association, 
			List<MObject> participants) {
		
		super(creator);
		fAssociation = association;
		fParticipants = participants;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public MAssociation getAssociation() {
		return fAssociation;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public List<MObject> getParticipants() {
		return fParticipants;
	}
}
