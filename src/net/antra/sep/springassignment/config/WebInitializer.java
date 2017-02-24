
package net.antra.sep.springassignment.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { MvcConfig.class, AppSecurityConfig.class, PersistenceJPAConfig.class, SecurityInit.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    } 
}
