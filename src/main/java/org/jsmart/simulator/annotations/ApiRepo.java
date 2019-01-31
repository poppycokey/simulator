package org.jsmart.simulator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The folder name where the simulator jsons reside. Usually the folder is maintained
 * under src/resources. But it can be configured to point to any custom folder for
 * project or developer convenience.
 *
 * @author Siddha
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
/*
* @Description: Specify the json file path describing the api
* @author:
* @date:
* @email: zbl686868@126.com
* @phone: 17611305537
*/
public @interface ApiRepo {
    String value();
}
