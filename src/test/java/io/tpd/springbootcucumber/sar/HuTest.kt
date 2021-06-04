package com.mj.lp

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["src/test/resources/features/"],
    dryRun = false,
    plugin = ["json:lexor_error_feature.json"],
    glue = [""],
    strict = true
)
class RunCukesTest