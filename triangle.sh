#!/bin/sh
for i in `seq 1 10`
	do 
		for j in `seq $i`
		do
			echo -n "# "
		done
	echo
done
