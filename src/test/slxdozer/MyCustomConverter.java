package slxdozer;

import org.dozer.CustomConverter;

/**
 * Created by slx on 2017/6/14.
 */
public class MyCustomConverter implements CustomConverter {
    public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,
                          Class<?> sourceClass) {
        Object obj = null;
        if (null != sourceFieldValue) {
            if (sourceFieldValue instanceof Integer) {
                if (((Integer) sourceFieldValue).intValue() == 1900) {
                    obj = "20世纪";
                } else if (((Integer) sourceFieldValue).intValue() == 2000) {
                    obj = "21世纪";
                }
            } else if (sourceFieldValue instanceof String) {
                if ("20世纪".equals(sourceFieldValue)) {
                    obj = 1900;
                } else if ("21世纪".equals(sourceFieldValue)) {
                    obj = 2000;
                }
            }
        }
        return obj;
    }
}
