package org.doxer.page

import geb.Page

/**
 *
 * @author m-kakimi
 *
 */
abstract class BasePage extends Page {

//	private static final classLoader = BasePage.class.getClassLoader()

	static final sysenv = new ConfigSlurper().parse(new File("./properties/sysenv.groovy").toURI().toURL())

	static final domain = sysenv.testtarget.domain

}
