package app.constants;

import java.io.File;

public abstract class FilePaths {

	/**
	 * This is Base path for all the page locators
	 */

	public static final String PROPERTIES_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "config"
			+ File.separator;

	public static final String PNG_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "src"
			+ File.separator + "main" + File.separator + "resources" + File.separator + "MediaFiles" + File.separator
			+ "PNG.png";

}
