#!groovy

def call() {
  properties([disableConcurrentBuilds()])
  stage('Init') {
    println "Init"
  }
  stage('Build') {
    println "Build"

  }
  stage('Test') {
    println "Test"
  }
  stage('Publis'){
    println "Publish"

  }
  stage('Finish') {
    println "Finish"
  }
}
