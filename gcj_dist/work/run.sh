#!/bin/bash

TARGET_MAIN_JAVA=../../src/mutexes/Main.java
PROBLEM_NAME=mutexes

#------

INPUT_JAVA=${PROBLEM_NAME}.java
INPUTS=(inputs/${PROBLEM_NAME}*)
for in_file in "${INPUTS[@]}"; do
    echo "input file = ${in_file} "
done

ulimit -n 10000
NUM_OF_NODES=10

DCJ_DIR="/usr/local/opt/dcj_mac_os"
DCJ="${DCJ_DIR}/dcj.sh"

cd tmp

for in_file in "${INPUTS[@]}"; do
    rm -f ../tmp/*

    echo "----- $in_file -----"
    cat $TARGET_MAIN_JAVA | egrep -v '^package .+;' | grep -v 'import dcj.message;' > Main.java
    cp "../$in_file" $INPUT_JAVA

    $DCJ test --source Main.java --library $INPUT_JAVA --nodes $NUM_OF_NODES

    echo "-----"

    # rm -f ../tmp/*
done

