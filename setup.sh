#!/usr/bin/env bash
projectname=TowerWarZ
lang=java

echo Starting setup of project $projectname
if [ $lang = "java" ]; then
  echo "If you would like to generate Javadocs, append --jd=true to the end of ths script."
  echo "E.g. ./setup.sh --jd=true"
fi

if [ "$1" = "--jd=true" ]; then
  gen-jd=true
  echo Will generate javadocs
fi

if [ -f pom.xml ]; then
  echo "Detected the use of Maven, now checking if maven is installed..."
  if command -v mvn>/dev/null 2>&1; then
    echo "Maven is installed! Now setting up repo..."
    if [ -d "target" ]; then
      echo Removing maven generated things...
      mvn clean
    fi

    echo "Now downloading dependencies, hold on tight!"
    if [ "$gen-jd" = "true" ]; then
      mvn install -DskipTest=true -Dmaven.javadoc.skip=false -B -V
    else
      mvn install -DskipTests=true -Dmaven.javadoc.skip=true -B -V
    fi

  else
    echo "Unfortunately, Maven is not installed. Cannot setup. Aborting..."
    exit 1
  fi
fi
