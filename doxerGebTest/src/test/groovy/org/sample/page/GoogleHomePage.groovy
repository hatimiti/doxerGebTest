package org.sample.page

import org.doxer.page.BasePage

/**
 *
 * @author m-kakimi
 *
 */
class GoogleHomePage extends BasePage {

	static url = "https://${domain}/"

	static at = { title == 'Google' }

	GoogleHomePage() {
		printf("Hello**************")
	}

	static content = {

		searchButton { $('#gbqfba') }

	}
}
