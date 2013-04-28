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

package net.oesterholt.jxmlnote.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
 
public class XMLNoteResource {
	
	private static JarFile _resources=null;
	
	public static InputStream get(String resourceName) throws IOException {
		try {
			FileInputStream fin=new FileInputStream("org.jdesktop.JRichTextEditor.jxmlnote/resouces/"+resourceName);
			return fin;
		} catch (FileNotFoundException e) {
			if (_resources==null) {
				_resources=new JarFile("JXMLNote.jar");
			}
			ZipEntry entry=_resources.getEntry("org.jdesktop.JRichTextEditor.jxmlnote/resources"+resourceName);
			return _resources.getInputStream(entry);
		}
	}

}
