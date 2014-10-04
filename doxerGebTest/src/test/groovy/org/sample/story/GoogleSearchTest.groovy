package org.sample.story

import geb.spock.GebReportingSpec

import org.sample.page.GoogleHomePage

import spock.lang.Unroll

class GoogleSearchTest extends GebReportingSpec {

	@Unroll("#keywordを検索する")
	def 'a search word can be input'(){
		given:
		to GoogleHomePage

		expect:
		at GoogleHomePage

		report('Google')

		searchButton.click();
	}
//driver.navigate().back()               // usage of WebDriver API
//browser.page(<<previous Page class>>)
}
