#!/bin/bash

TARGET_MAIN_JAVA=../../src/gcj/task1/Main.java
INPUT_JAVA=oops.java
INPUTS=$(ls inputs/oops*)

NUM_OF_NODES=10

DCJ_DIR="/usr/local/opt/dcj_mac_os"
DCJ="${DCJ_DIR}/dcj.sh"

cd tmp

for in_file in $INPUTS; do
    # rm -f *

    echo "----- $in_file -----"
    cat $TARGET_MAIN_JAVA | egrep -v "package gcj.task[0-9];" > Main.java
    cp ../$in_file $INPUT_JAVA

    $DCJ test --source Main.java --library $INPUT_JAVA --nodes $NUM_OF_NODES

    echo "-----"

    # rm -f *
done
