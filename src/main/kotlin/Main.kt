fun main() {
    val testSteps = object : TestSteps {
        override fun beforeEach() {
            println("ovverided_beforeEach")
        }

        override fun afterEach() {
            println("ovverided_afterEach")
        }
    }

    val testRunner = AnotherTestRunner()

    testRunner.runTest(testSteps) {
        println("Executing the test")
    }
}
