/**
 * 
 */
package com.jt.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

public class JbdPropertyLoader {

	private final static Logger logger = Logger.getLogger(JbdPropertyLoader.class);

	static Properties property = new Properties();
	JbdRootConfigMapper confVO = new JbdRootConfigMapper();

/*	public JbdPropertyLoader() {
		loadPropertyFile();
	}
*/
	public static void loadPropertyFile() {
		String rootConfigFilePath = "properties/jt-config.properties";
		String rootConfigFileAbsPath = JbdPropertyLoader.class.getClassLoader().getResource(rootConfigFilePath).getPath();
		logger.info("Loading Root Config file at : " + rootConfigFileAbsPath);
		File rootConfigFile = new File(rootConfigFileAbsPath);
		if (rootConfigFile.exists()) {
			InputStream inStream;
			try {
				inStream = new FileInputStream(rootConfigFile);
				property.load(inStream);
			} catch (FileNotFoundException e) {
				logger.error(e.getMessage());
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		} else {
			logger.error("File Does not Exist.. Please check the file path..");
		}
	}

	public JbdRootConfigMapper getJbdRootConfigDetails() {
		loadPropertyFile();
		confVO.setLandingPage(property.getProperty("landingPageName"));
		return confVO;
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		JbdPropertyLoader ins = new JbdPropertyLoader();
	}

}
