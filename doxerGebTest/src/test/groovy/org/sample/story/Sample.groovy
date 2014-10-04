package org.sample.story

class Sample {

	public static def main(String... args) {
		println "Hello, Groovy"

		for (int i = 0; i < 3; i++) {
			println "now ${i}"
		}

		def meth = { return 1 + 1 }
		println m(meth)
	}

	static def m(Closure<Integer> meth) {
		println meth
		return meth() + meth()
	}

}
