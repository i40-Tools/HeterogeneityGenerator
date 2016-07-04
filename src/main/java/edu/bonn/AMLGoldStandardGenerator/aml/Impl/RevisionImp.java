/**
 * 
 */
package edu.bonn.AMLGoldStandardGenerator.aml.Impl;

import java.util.ArrayList;

import edu.bonn.AMLGolStandardGenerator.aml.CAEXBasicObject;

/**
 * @author omar
 *
 */
public class RevisionImp extends GenericElement {

	public static int minimum = 1;

	public static ArrayList<CAEXBasicObject.Revision> setObject() {
		// TODO Auto-generated method stub

		ArrayList<CAEXBasicObject.Revision> revision = new ArrayList<CAEXBasicObject.Revision>();
		for (int j = 0; j < minimum; j++) {

			revision.add(factory.createCAEXBasicObjectRevision());
			setValues(revision.get(j), j);
		}

		return revision;

	}

	public static void setValues(CAEXBasicObject.Revision type, int i) {

		type.setAuthorName("Author-" + i);
		type.setComment("this is comment" + i);
		type.setNewVersion("new version" + i);
		type.setOldVersion("oldversion" + i);
	}

}
