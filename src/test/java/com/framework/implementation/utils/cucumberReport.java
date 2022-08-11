package com.framework.implementation.utils;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class cucumberReport {

    public static void main(String[] args) {
        {
            File reportOutputDirectory = new File("target");
            List<String> jsonFiles = new ArrayList<>();
            jsonFiles.add("target/cucumber.json");
            String projectName = "Test_Sample";
            Configuration configuration = new Configuration(reportOutputDirectory, projectName);
            ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
            reportBuilder.generateReports();
        }
    }
}