package com.hoaxify.ws.user;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD})/** Hangi alanlarda kullanılacak onu belirliyoruz (Burada field dediğimiz; değişkenler). */
@Retention(RetentionPolicy.RUNTIME)/** Annotation'ın runtime da çözümlenmesi ile ilgili bir davranış. */
@Constraint(validatedBy = UniqueUsernameValidator.class)/** Bu validation'un kullanıldığı yerlerde uygulanacak olan validation logic'inin muhatap class'ı soruluyor.*/
public @interface UniqueUsername {

    String message() default "Username unique olmak zorundadır.";

    Class<?>[] groups() default{};
    
    Class<? extends Payload>[] payload() default {};
}
