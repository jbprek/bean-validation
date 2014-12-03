package org.hibernate.validator.referenceguide.chapter08;

import javax.validation.MessageInterpolator;
import java.util.Locale;

public class MyMessageInterpolator implements MessageInterpolator {

    @Override
    public String interpolate(String messageTemplate, Context context) {
        //...
        return null;
    }

    @Override
    public String interpolate(String messageTemplate, Context context, Locale locale) {
        //...
        return null;
    }
}
