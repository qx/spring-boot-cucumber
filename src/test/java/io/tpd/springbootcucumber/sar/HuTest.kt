package io.tpd.springbootcucumber.sar

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["src/test/resources/features/sar"],
    dryRun = false,
    plugin = ["pretty","json:lexor_error_feature.json"],
    glue = [""],
    strict = true
)
class RunCukesTest