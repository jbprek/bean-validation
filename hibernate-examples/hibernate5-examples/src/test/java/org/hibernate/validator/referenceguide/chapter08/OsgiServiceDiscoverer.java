package org.hibernate.validator.referenceguide.chapter08;

import javax.validation.ValidationProviderResolver;
import javax.validation.spi.ValidationProvider;
import java.util.List;

public class OsgiServiceDiscoverer implements ValidationProviderResolver {

    @Override
    public List<ValidationProvider<?>> getValidationProviders() {
        //...
        return null;
    }
}
