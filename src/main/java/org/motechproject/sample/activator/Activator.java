package org.motechproject.sample.activator;

import org.eclipse.gemini.blueprint.util.OsgiStringUtils;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println(String.format("Bundle %s started.", bundleName(context)));
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println(String.format("Bundle %s stopped.", bundleName(context)));
    }

    private String bundleName(BundleContext context) {
        return OsgiStringUtils.nullSafeSymbolicName(context.getBundle());
    }
}
