#!/bin/bash

echo enter filename

read fname
len=${#fname}
mkdir $fname
cd $fname
for((i=1;i<5;i++))
do
touch $fname$i

done

zip -r $fname.zip *
for (( i=$len-1; i>=0; i-- ))
do
reverse="$reverse${fname:$i:1}"
done
mkdir $reverse
unzip $fname.zip -d $reverse/$fname

for((i=1;i<5;i++))
do
cp $fname$i $reverse
done

cd $reverse
 rm -r $fname/*

rename  fname/#/somethingelse/ *
