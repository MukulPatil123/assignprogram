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

var="$PWD"
 rm -r $fname/*

sudo adduser devops
sudo chmod -R devops:devops $var
sudo chmod -R 755  $var
cd "$var"
ls

