package com.falah.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Inherited
@Documented
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
public @interface Institute {
	String iname() default "falah";
	String iadd() default "Jaipur";
	String iweb() default "falah/web";
	
}
