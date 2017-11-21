rem @echo off



git add --all
git commit -m "autocommit with batch file %date% %time%"
git push -u origin master


pause