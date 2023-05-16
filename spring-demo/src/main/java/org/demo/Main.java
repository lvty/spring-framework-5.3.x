package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 *     TODO
 * </p>
 *
 * @author ${USER}
 * @since ${DATE}
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);

		Bean bean = acac.getBean(Bean.class);
		bean.hello();
	}
}