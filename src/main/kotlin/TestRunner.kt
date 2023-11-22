interface TestRunner {
    fun runTest(steps: TestSteps, test: () -> Unit)
}
