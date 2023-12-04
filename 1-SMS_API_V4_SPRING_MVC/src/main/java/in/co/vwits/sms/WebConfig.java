package in.co.vwits.sms;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//This is the class executed first by web container (Tomcat)
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {StudenManagementWebConfigauration.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};//This is url pattern which delegates request to DispatcherServlate.
	}

}
