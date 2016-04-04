package com.tsystems.webapp.validation;


import com.tsystems.webapp.entity.StationEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class StationValidator implements Validator{



    @Override
    public boolean supports(Class<?> aClass) {
        return StationEntity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {



        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nameStation", "label.validate.nameStationEmpty");
    }

}
