package pt.example.fm;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FtlHelloWorld {

	public static void main(String[] args) {
		// Freemarker configuration object
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);
		try {
			// Load template from source folder
			cfg.setDirectoryForTemplateLoading(new File("src"));
			Template template = cfg.getTemplate("HelloWorldExample.ftl");

			// Build the data model
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("message", "Hello World :)");

			List<String> countries = new ArrayList<String>();
			countries.add("Portugal");
			countries.add("Spain");
			countries.add("France");
			countries.add("United Kingdom");

			data.put("countries", countries);

			// File output
			//Writer file = new FileWriter(new File("FTL_helloworld.txt"));
			Writer file = new PrintWriter(System.out);
			template.process(data, file);
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
}
