package edu.nyu.cs9053.homework6;
import java.lang.annotation.*;
/**
 * User: blangel
 * Date: 10/5/14
 * Time: 6:21 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})

public @interface Vaccine {

    /**
     * @return the Disease for which this annotated object is vaccinated against
     */
    Disease cures();

    /**
     * @return the seed which created this vaccine for the associated {@linkplain edu.nyu.cs9053.homework6.Disease}
     */
    long seed() default Long.MIN_VALUE;

    /**
     * @return the antidote for the associated {@linkplain edu.nyu.cs9053.homework6.Disease}
     */
    String antidote() default "";

}