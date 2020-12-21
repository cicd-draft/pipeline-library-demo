#!/usr/bin/env groovy

def call(String... args) {
    if ( args.length == 0 ){
        log.info '>>>>>>publish cucumbet report without parameter ...'
        publishHTML (target: [
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: true,
            reportDir: './target/cucumber/cucumber-html-reports',
            reportFiles: 'overview-features.html',
            reportName: "Cucumber-Report"
        ]) 
    } else if ( args.length == 1 ){
        log.info '>>>>>>publish cucumbet report with date parameter ...args[0] should be date e.g. 20201103'
        publishHTML (target: [
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: true,
            reportDir: './target/cucumber/cucumber-html-reports',
            reportFiles: 'overview-features.html',
            reportName: "${args[0]}-Cucumber-Report"
        ]) 
    } else if ( args.length == 2 ) {
        log.info '>>>>>>publish cucumbet report with date parameter ...args[0] should be date e.g. 20201103,args[1] should be folder name e.g. OpenDoor'
        publishHTML (target: [
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: true,
            reportDir: "../${args[1]}/target/cucumber/cucumber-html-reports",
            reportFiles: 'overview-features.html',
            reportName: "${args[0]}-Cucumber-Report"
        ])         
    } else {
        log.error "!!! Please pass the 0 or 1 or 2 parameter" 
        error("Aborting the job.")
    }      
}