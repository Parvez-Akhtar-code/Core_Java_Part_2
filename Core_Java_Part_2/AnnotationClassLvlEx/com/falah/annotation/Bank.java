package com.falah.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Inherited
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface Bank {
	String bankid() default "B-111";
	String bankname() default "ICICI";
	String bankaddress() default "jaipur";
}
