/*
 * This file is part of aion-unique <aion-unique.com>.
 *
 *  aion-unique is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  aion-unique is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with aion-unique.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.gameserver.skillengine.condition;

import com.aionemu.gameserver.controllers.movement.MoveObserver;

/**
 * @author ATracer
 *
 */
public class ConditionChangeListener implements MoveObserver
{
	private boolean effectorMoved = false;

	/**
	 * @return the effectorMoved
	 */
	public boolean isEffectorMoved()
	{
		return effectorMoved;
	}


	/* (non-Javadoc)
	 * @see com.aionemu.gameserver.controllers.movement.MoveObserver#moved()
	 */
	@Override
	public void moved()
	{
		effectorMoved = true;
	}
}