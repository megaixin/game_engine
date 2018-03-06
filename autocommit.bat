rem @echo off


git config --global user.email megaixin12@mail.ru
git config --global user.password renerarr1209jnr

git add --all
git commit -m "autocommit with batch file %date% %time%"
git push -u origin master


pause