#!/usr/bin/env groovy

def call(body) {
    withCredentials([usernamePassword(credentialsId: 'Some-DB-user-pwd', passwordVariable: 'PW', usernameVariable: 'USER')]) {
        body()
    }
}