#!/bin/bash
USER=Marina

echo Hello $USER
for run in {1..3}
do
echo -e "\n autocomit $run \n" >> README.md
git add .
git commit -m "test commit # $run"
sleep1
done
git push


 autocomit 1 

