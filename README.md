#!/bin/bash
USER=Marina

echo Hello $USER
for run in {1..3}
do
echo -e "\n autocommit $run \n" >> README.md
git add .
git commit -m "test commit # $run"
sleep 1
done
git push

 
 

