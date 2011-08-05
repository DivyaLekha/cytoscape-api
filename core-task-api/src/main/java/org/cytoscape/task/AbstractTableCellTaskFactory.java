/*
 Copyright (c) 2010, The Cytoscape Consortium (www.cytoscape.org)

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/
package org.cytoscape.task;


import org.cytoscape.work.TaskFactory;
import org.cytoscape.model.CyColumn;


/**
 * The assumption is that setColumnAndPrimaryKey() will be called before getTask() and that the Task
 * in question operates on the specified table entry identified by the column and primary key value.'
 */
abstract public class AbstractTableCellTaskFactory implements TableCellTaskFactory {
	protected CyColumn column;
	protected Object primaryKeyValue;

	/** Used to provision this factory with a {@param CyColumn} and a primary key that will be
	 *  used to create tasks.
	 *  @param column  a non-null CyColumn
	 *  @param primaryKeyValue  a non-null primary key value
	 */
	public void setColumnAndPrimaryKey(final CyColumn column, final Object primaryKeyValue) {
		if (column == null)
			throw new  NullPointerException("\"column\" parameter must *never* be null!");
		this.column = column;
		if (primaryKeyValue == null)
			throw new NullPointerException("\"primaryKeyValue\" parameter must *never* be null!");
		this.primaryKeyValue = primaryKeyValue;
	}
}