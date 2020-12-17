/* 
 * Goal is to convert an object into JSON string
 * Class level annotation
 * This can be applied only on class
 * This annotation will be used on class to indicate complier that the object of class can be serialized.
*/


package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//Marker annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {

}