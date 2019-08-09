package mavenprojectprototype;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {
	
	public Properties readPropFile() throws IOException {
		Properties properties=new Properties();
		FileInputStream ip= new FileInputStream("D:\\cucumbertesting\\mavenprojectprototype\\src\\main\\resources\\prop.properties");
		properties.load(ip);
		return properties;
	}

}
