interface TestSteps {
    fun beforeEach()
    fun afterEach()
}

class AnotherTestRunner {
    fun runTest(steps: TestSteps, test: () -> Unit) {
        try {
            println("example_beforeEach")
            steps.beforeEach()

            println("Running test")
            test.invoke()

        } finally {
            println("example_afterEach")
            steps.afterEach()
        }
    }
}