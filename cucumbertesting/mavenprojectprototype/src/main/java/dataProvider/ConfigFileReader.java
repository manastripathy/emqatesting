package dataProvider;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	Properties properties;
	public String getReportConfigPath() throws IOException{
		Properties properties=new Properties();
		FileInputStream ip= new FileInputStream("D:\\cucumbertesting\\mavenprojectprototype\\configs\\Configuration.properties");
		properties.load(ip);
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
