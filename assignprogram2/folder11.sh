#!/bin/bash
echo folder name
read folder 
mkdir $folder
cd $folder
for((i=1;i<5;i++))
do
echo filename$i
touch $folder$i
done



zip -r $folder.zip *

