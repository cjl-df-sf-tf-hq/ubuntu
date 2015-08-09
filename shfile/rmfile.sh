#!/bin/bash
if [ $1 = "" ]; then 
    echo "$0"
else
    if [ $2 = "" ]; then
        `find ./ | grep $1 | xargs sudo rm -rf` 
    else
        `find $2 | grep $1 | xargs sudo rm -rf` 
    fi
fi
