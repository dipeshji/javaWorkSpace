/*
 * Goal is to convert an object into JSON string
 * Method level annotation
 * This can be only applied on methods
 * Before serializing an object to JSON string if we want to execute some method to initialize an object
*/

package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Init {

}
