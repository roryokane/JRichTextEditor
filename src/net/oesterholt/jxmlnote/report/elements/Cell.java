/* ******************************************************************************
 *
 *       Copyright 2008-2010 Hans Oesterholt-Dijkema
 *
 *   JRichTextEditor is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as 
 *   published by the Free Software Foundation, either version 3 of 
 *   the License, or (at your option) any later version.
 *
 *   JRichTextEditor is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with JRichTextEditor.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * ******************************************************************************/

package net.oesterholt.jxmlnote.report.elements;

import java.awt.Color;

public interface Cell {
	public Cell setNoBorder();
	public Cell setBorder(Color c,float pt);
	public Cell setBorderTop(Color c,float pt);
	public Cell setBorderBottom(Color c,float pt);
	public Cell setBorderLeft(Color c,float pt);
	public Cell setBorderRight(Color c,float pt);
	public Cell setBackground(Color c);
	public Cell add(ReportElement el);
}

