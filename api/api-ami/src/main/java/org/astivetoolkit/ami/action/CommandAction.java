/*
 * Copyright (C) 2010-2012 PhonyTive LLC
 * http://astive.phonytive.com
 *
 * This file is part of Astive Toolkit
 *
 * Astive is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Astive is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Astive.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.astivetoolkit.ami.action;


/**
 *
 * @since 1.0.0
 */
public class CommandAction extends ActionMessage {
  private String command;

  /**
   * Creates a new CommandAction object.
   *
   * @param command DOCUMENT ME!
   */
  public CommandAction(String command) {
    super(ActionType.COMMAND);
    this.command = command;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCommand() {
    return command;
  }

  /**
   * DOCUMENT ME!
   *
   * @param command DOCUMENT ME!
   */
  public void setCommand(String command) {
    this.command = command;
  }
}