package com.bank.application.listeners;


import com.bank.application.model.BaseEntityId;
import org.hibernate.type.OffsetDateTimeType;
import org.springframework.util.ReflectionUtils;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.lang.reflect.Field;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 01.09.2018.
 * @version $Id$.
 * @since 0.1.
 */
public class EntityListener {

    @PrePersist
    public void prePersist(BaseEntityId entity) {
        Class cl = entity.getClass();
        Field[] fields = cl.getFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(CreatedDate.class)) {
                field.setAccessible(true);
                ReflectionUtils.setField(field, entity, OffsetDateTimeType.INSTANCE);
                break;
            }
        }
    }

    @PreUpdate
    public void preUpdate(BaseEntityId entity) {
        Class cl = entity.getClass();
        Field[] fields = cl.getFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(UpdateDate.class)) {
                field.setAccessible(true);
                ReflectionUtils.setField(field, entity, OffsetDateTimeType.INSTANCE);
                break;
            }
        }
    }
}
