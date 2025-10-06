#!/bin/bash
#
# Build tool for Spring Boot application

function build_java_app {
  mvn clean install
}

function build_container {
  sudo docker build -f Containerfile -t runnerz:latest .
}

function run_compose_project {
  sudo docker compose -f compose.yaml up -d --force-recreate
}

function main {
  build_java_app
  build_container
  run_compose_project
}

main
