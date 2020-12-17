/* 
 * Goal is to convert an object into JSON string
 * Field level annotation
 * This can be applied only on fields
 * This annotation will be applied on fields that we want to include in the JSON string
*/

package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonElement {
	public String key() default ""; //variable
}
