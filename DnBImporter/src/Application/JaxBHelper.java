package Application;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JaxBHelper {
	public static String ConvertJaxBToString(@SuppressWarnings("rawtypes") Class classType, Object objectToConvert)
	{
		StringWriter sWriter = new StringWriter();
		try
		{
		JAXBContext context = JAXBContext.newInstance(classType);
		Marshaller marshaller = context.createMarshaller();
		
		marshaller.marshal(objectToConvert, sWriter);
		}
		catch(Exception e)
		{
			// Not sure what to do here - revisit
			return e.getMessage();
		}
		return sWriter.toString();
	}
}
